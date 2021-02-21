package com.example.android.wechat.service;

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

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/22
 */
public interface LoginService {
    /**
     * 检查手机是否被注册
     *
     * \@POST("user/check_phone_available")
     */
    CheckPhoneResponse checkPhoneAvailable(CheckPhoneRequest request);

    /**
     * 发送验证码
     *
     * \@POST("user/send_code")
     */
    SendCodeResponse sendCode(SendCodeRequest request);

    /**
     * 验证验证码是否正确(必选先用手机号码调sendcode)
     *
     * \@POST("user/verify_code")
     */
    VerifyCodeResponse verifyCode(VerifyCodeRequest request);

    /**
     * 注册
     *
     * \@POST("user/register")
     */
    RegisterResponse register(RegisterRequest request);

    /**
     * 登录
     *
     * \@POST("user/login")
     */
    LoginResponse login(LoginRequest request);
}
