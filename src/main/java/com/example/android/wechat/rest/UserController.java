package com.example.android.wechat.rest;

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
import com.example.android.wechat.response.GetUserInfosResponse;
import com.example.android.wechat.response.QiNiuTokenResponse;
import com.example.android.wechat.response.RemoveFromBlackListResponse;
import com.example.android.wechat.response.RestPasswordResponse;
import com.example.android.wechat.response.SetNameResponse;
import com.example.android.wechat.response.SetPortraitResponse;
import com.example.android.wechat.response.SyncTotalDataResponse;
import com.example.android.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@RestController
@RequestMapping("/wx")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/get_token")
    public GetTokenResponse getToken() {
        return userService.getToken();
    }

    @PostMapping("/user/set_nickname")
    public SetNameResponse setName(@RequestBody @Valid SetNameRequest request) {
        return userService.setName(request);
    }

    @PostMapping("/user/set_portrait_uri")
    public SetPortraitResponse setPortrait(@RequestBody @Valid SetPortraitRequest request) {
        return userService.setPortrait(request);
    }

    @PostMapping("/user/change_password")
    public ChangePasswordResponse changePassword(@RequestBody @Valid ChangePasswordRequest request) {
        return userService.changePassword(request);
    }

    @PostMapping("/user/reset_password")
    public RestPasswordResponse restPassword(@RequestBody @Valid RestPasswordRequest request) {
        return userService.restPassword(request);
    }

    @GetMapping("/user/{userid}")
    public GetUserInfoByIdResponse getUserInfoById(@PathVariable("userid") Long userid) {
        return userService.getUserInfoById(userid);
    }

    @GetMapping("/user/find/{region}/{phone}")
    public GetUserInfoByPhoneResponse getUserInfoFromPhone(@PathVariable("region") String region, @PathVariable("phone") String phone) {
        return userService.getUserInfoFromPhone(region, phone);
    }

    @GetMapping("/user/blacklist")
    public GetBlackListResponse getBlackList() {
        return userService.getBlackList();
    }

    @PostMapping("/user/add_to_blacklist")
    public AddToBlackListResponse addToBlackList(@RequestBody @Valid AddToBlackListRequest request) {
        return userService.addToBlackList(request);
    }

    @PostMapping("/user/remove_from_blacklist")
    public RemoveFromBlackListResponse removeFromBlackList(@RequestBody @Valid RemoveFromBlacklistRequest request) {
        return userService.removeFromBlackList(request);
    }
}
