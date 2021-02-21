package com.example.android.wechat.service.impl;

import com.example.android.common.utils.DataUtils;
import com.example.android.wechat.model.WxUser;
import com.example.android.wechat.repository.WxUserRepository;
import com.example.android.wechat.request.AddToBlackListRequest;
import com.example.android.wechat.request.ChangePasswordRequest;
import com.example.android.wechat.request.RemoveFromBlacklistRequest;
import com.example.android.wechat.request.RestPasswordRequest;
import com.example.android.wechat.request.SetNameRequest;
import com.example.android.wechat.request.SetPortraitRequest;
import com.example.android.wechat.response.AddToBlackListResponse;
import com.example.android.wechat.response.ChangePasswordResponse;
import com.example.android.wechat.response.GetBlackListResponse;
import com.example.android.wechat.response.GetTokenResponse;
import com.example.android.wechat.response.GetUserInfoByIdResponse;
import com.example.android.wechat.response.GetUserInfoByPhoneResponse;
import com.example.android.wechat.response.RemoveFromBlackListResponse;
import com.example.android.wechat.response.RestPasswordResponse;
import com.example.android.wechat.response.SetNameResponse;
import com.example.android.wechat.response.SetPortraitResponse;
import com.example.android.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/22
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private WxUserRepository wxUserRepository;

    @Override
    public GetTokenResponse getToken() {
        return null;
    }

    @Override
    public SetNameResponse setName(SetNameRequest request) {
        return null;
    }

    @Override
    public SetPortraitResponse setPortrait(SetPortraitRequest request) {
        return null;
    }

    @Override
    public ChangePasswordResponse changePassword(ChangePasswordRequest request) {
        return null;
    }

    @Override
    public RestPasswordResponse restPassword(RestPasswordRequest request) {
        return null;
    }

    @Override
    public GetUserInfoByIdResponse getUserInfoById(Long userid) {
        final Optional<WxUser> wxUserOptional = wxUserRepository.findById(userid);
        if (wxUserOptional.isPresent()) {
            WxUser wxUser = wxUserOptional.get();
            return GetUserInfoByIdResponse.builder()
                    .code(HttpStatus.OK.value())
                    .result(GetUserInfoByIdResponse.ResultEntity.builder()
                            .id(String.valueOf(wxUser.getId()))
                            .nickname(wxUser.getNickname())
                            .portraitUri(DataUtils.fillUrl(wxUser.getPortraitUri()))
                            .build())
                    .build();
        }

        return GetUserInfoByIdResponse.builder()
                .code(HttpStatus.OK.value())
                .result(GetUserInfoByIdResponse.ResultEntity.builder().build())
                .build();
    }

    @Override
    public GetUserInfoByPhoneResponse getUserInfoFromPhone(String region, String phone) {
        return null;
    }

    @Override
    public GetBlackListResponse getBlackList() {
        return null;
    }

    @Override
    public AddToBlackListResponse addToBlackList(AddToBlackListRequest request) {
        return null;
    }

    @Override
    public RemoveFromBlackListResponse removeFromBlackList(RemoveFromBlacklistRequest request) {
        return null;
    }
}
