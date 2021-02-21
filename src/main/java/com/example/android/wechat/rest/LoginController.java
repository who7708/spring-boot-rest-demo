package com.example.android.wechat.rest;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 登陆相关
 *
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@RestController
@RequestMapping("/wx")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/user/check_phone_available")
    public CheckPhoneResponse checkPhoneAvailable(@RequestBody @Valid CheckPhoneRequest request) {
        return loginService.checkPhoneAvailable(request);
    }

    @PostMapping("/user/send_code")
    public SendCodeResponse sendCode(@RequestBody @Valid SendCodeRequest request) {
        return loginService.sendCode(request);
    }

    @PostMapping("/user/verify_code")
    public VerifyCodeResponse verifyCode(@RequestBody @Valid VerifyCodeRequest request) {
        return loginService.verifyCode(request);
    }

    @PostMapping("/user/register")
    public RegisterResponse register(@RequestBody @Valid RegisterRequest request) {
        return loginService.register(request);
    }

    @PostMapping("/user/login")
    public LoginResponse login(@RequestBody @Valid LoginRequest request) {
        return loginService.login(request);
    }
}
