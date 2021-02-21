package com.example.android.wechat.manage;

import com.example.android.common.utils.DataUtils;
import com.example.android.common.utils.PinyinUtils;
import com.example.android.wechat.model.WxUser;
import com.example.android.wechat.repository.WxFriendShipRepository;
import com.example.android.wechat.repository.WxUserRepository;
import com.example.android.wechat.response.UserRelationshipResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/22
 */
@Component
public class FriendManager {

    @Autowired
    private WxUserRepository wxUserRepository;

    @Autowired
    private WxFriendShipRepository wxFriendShipRepository;

    public UserRelationshipResponse getUserRelationShipByUserId(Long userId) {
        // 查询好友关系
        final List<UserRelationshipResponse.ResultEntity> results = wxFriendShipRepository.findByPid(userId).stream()
                .map(wxFriendShip -> {
                    // 查询对应用户
                    final Optional<WxUser> wxUserOptional = wxUserRepository.findById(wxFriendShip.getPid());
                    if (wxUserOptional.isPresent()) {
                        final WxUser wxUser = wxUserOptional.get();
                        return UserRelationshipResponse.ResultEntity.builder()
                                .displayName(wxFriendShip.getMarkName())
                                .message(wxFriendShip.getMessage())
                                .status(wxFriendShip.getStatus())
                                .updatedAt(DataUtils.formatDate(wxFriendShip.getUpdateTime()))
                                .pinyin(PinyinUtils.getPinyin(wxFriendShip.getMarkName()))
                                .user(UserRelationshipResponse.ResultEntity.UserEntity.builder()
                                        .id(String.valueOf(wxUser.getId()))
                                        .nickname(wxUser.getNickname())
                                        .portraitUri(DataUtils.fillUrl(wxUser.getPortraitUri()))
                                        .build())
                                .build();
                    }
                    return null;
                }).filter(Objects::nonNull).collect(Collectors.toList());

        return UserRelationshipResponse.builder()
                .code(HttpStatus.OK.value())
                .results(results)
                .build();
    }

}
