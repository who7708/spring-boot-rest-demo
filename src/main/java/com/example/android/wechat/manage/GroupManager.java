package com.example.android.wechat.manage;

import com.example.android.common.utils.DataUtils;
import com.example.android.wechat.model.WxGroupUser;
import com.example.android.wechat.model.WxUser;
import com.example.android.wechat.repository.WxGroupRepository;
import com.example.android.wechat.repository.WxGroupUserRepository;
import com.example.android.wechat.repository.WxUserRepository;
import com.example.android.wechat.response.GetGroupMemberResponse;
import com.example.android.wechat.response.GetGroupResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * web -> service -> manager -> dao...
 *
 * manager 可以组合多个dao或第三方接口，然后组装
 *
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/22
 */
@Component
public class GroupManager {
    @Autowired
    private WxGroupRepository wxGroupRepository;

    @Autowired
    private WxGroupUserRepository wxGroupUserRepository;

    @Autowired
    private WxUserRepository wxUserRepository;

    public GetGroupResponse getGroupsByUserId(Long userId) {
        // 1. 查询用户所有群组 wxGroupUserRepository
        // 2. 查询用户群组信息 wxUserRepository
        // 3. 查询群成员数量
        final List<WxGroupUser> groupUsers = wxGroupUserRepository.findByUid(userId);
        final List<Long> gids = groupUsers.stream().map(WxGroupUser::getGid).collect(Collectors.toList());
        final List<GetGroupResponse.ResultEntity> results = wxGroupRepository.findAllById(gids).stream()
                .map(wxGroup -> {
                    // 群人数
                    int memberCount = wxGroupUserRepository.countByGid(wxGroup.getId());
                    return GetGroupResponse.ResultEntity.builder()
                            // 0: 创建者/群主, 1: 普通成员
                            .role(userId.equals(wxGroup.getOwner()) ? 1 : 0)
                            .group(GetGroupResponse.ResultEntity.GroupEntity.builder()
                                    .id(String.valueOf(wxGroup.getId()))
                                    .name(wxGroup.getName())
                                    .portraitUri(DataUtils.fillUrl(wxGroup.getPortraitUri()))
                                    // 群主 id
                                    .creatorId(String.valueOf(wxGroup.getOwner()))
                                    .memberCount(memberCount)
                                    .build())
                            .build();
                }).collect(Collectors.toList());

        return GetGroupResponse.builder()
                .code(HttpStatus.OK.value())
                .results(results)
                .build();
    }

    public GetGroupMemberResponse getGroupMemberById(Long groupId) {
        final List<GetGroupMemberResponse.ResultEntity> results = wxGroupUserRepository.findByGid(groupId).stream()
                .map(wxGroupUser -> {
                    final Optional<WxUser> wxUserOptional = wxUserRepository.findById(wxGroupUser.getUid());
                    if (wxUserOptional.isPresent()) {
                        final WxUser wxUser = wxUserOptional.get();
                        return GetGroupMemberResponse.ResultEntity.builder()
                                .displayName(wxUser.getNickname())
                                .role(wxGroupUser.getAdmin() == 1 ? 1 : 0)
                                .createdAt(DataUtils.formatDate(wxUser.getCreateTime()))
                                .user(GetGroupMemberResponse.ResultEntity.UserEntity.builder()
                                        .id(String.valueOf(wxUser.getId()))
                                        .nickname(wxUser.getNickname())
                                        .portraitUri(DataUtils.fillUrl(wxUser.getPortraitUri()))
                                        .build())
                                .build();
                    }
                    return null;
                }).filter(Objects::nonNull)
                .collect(Collectors.toList());

        return GetGroupMemberResponse.builder()
                .code(HttpStatus.OK.value())
                .results(results)
                .build();
    }
}
