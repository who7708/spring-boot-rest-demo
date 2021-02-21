package com.example.android.wechat.rest;

import com.example.android.wechat.response.DefaultConversationResponse;
import com.example.android.wechat.response.GetUserInfosResponse;
import com.example.android.wechat.response.QiNiuTokenResponse;
import com.example.android.wechat.response.SyncTotalDataResponse;
import com.example.android.wechat.response.VersionResponse;
import com.example.android.wechat.service.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@RestController
@RequestMapping("/wx")
public class WechatController2 {

    @Autowired
    private WechatService wechatService;

    @GetMapping("misc/demo_square")
    public DefaultConversationResponse getDefaultConversation() {
        return wechatService.getDefaultConversation();
    }

    @GetMapping("/user/batch?{params}")
    public GetUserInfosResponse getUserInfos(@PathVariable("params") String params) {
        return wechatService.getUserInfos(params);
    }

    @GetMapping("/user/get_image_token")
    public QiNiuTokenResponse getQiNiuToken() {
        return wechatService.getQiNiuToken();
    }

    @GetMapping("/misc/client_version")
    public VersionResponse getClientVersion() {
        return wechatService.getClientVersion();
    }

    @GetMapping("/user/sync/{version}")
    public SyncTotalDataResponse syncTotalData(@PathVariable("version") String version) {
        return wechatService.syncTotalData(version);
    }

    public byte[] downloadPic(String url) {
        return wechatService.downloadPic(url);
    }
}
