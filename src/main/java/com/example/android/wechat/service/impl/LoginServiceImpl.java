package com.example.android.wechat.service.impl;

import com.example.android.common.utils.DataUtils;
import com.example.android.common.utils.RSA;
import com.example.android.wechat.model.WxUser;
import com.example.android.wechat.repository.WxUserRepository;
import com.example.android.wechat.request.CheckPhoneRequest;
import com.example.android.wechat.request.LoginRequest;
import com.example.android.wechat.request.RegisterRequest;
import com.example.android.wechat.request.SendCodeRequest;
import com.example.android.wechat.request.VerifyCodeRequest;
import com.example.android.wechat.response.CheckPhoneResponse;
import com.example.android.wechat.response.LoginResponse;
import com.example.android.wechat.response.RegisterResponse;
import com.example.android.wechat.response.SendCodeResponse;
import com.example.android.wechat.response.VerifyCodeResponse;
import com.example.android.wechat.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/22
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private WxUserRepository wxUserRepository;

    @Override
    public CheckPhoneResponse checkPhoneAvailable(CheckPhoneRequest request) {
        return null;
    }

    @Override
    public SendCodeResponse sendCode(SendCodeRequest request) {
        return null;
    }

    @Override
    public VerifyCodeResponse verifyCode(VerifyCodeRequest request) {
        return null;
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {
        return RegisterResponse.builder()
                .code(HttpStatus.OK.value())
                .result(RegisterResponse.ResultEntity.builder()
                        .id(DataUtils.uuid())
                        .build())
                .build();
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        final WxUser wxUser = wxUserRepository.findFirstByRegionAndPhoneAndPassword(request.getRegion(), request.getPhone(), request.getPassword());
        String data = wxUser.getId() + ":" + wxUser.getUserId() + ":" + System.currentTimeMillis();
        String token = RSA.encrypt(data);
        return LoginResponse.builder()
                .code(HttpStatus.OK.value())
                .result(LoginResponse.ResultEntity.builder()
                        .id(String.valueOf(wxUser.getId()))
                        .token(token)
                        .build())
                .build();
    }
}
