package com.example.android.wechat.service.impl;

import com.example.android.wechat.response.DefaultConversationResponse;
import com.example.android.wechat.response.GetUserInfosResponse;
import com.example.android.wechat.response.QiNiuTokenResponse;
import com.example.android.wechat.response.SyncTotalDataResponse;
import com.example.android.wechat.response.VersionResponse;
import com.example.android.wechat.service.WechatService;
import org.springframework.stereotype.Service;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@Service
public class WechatServiceImpl implements WechatService {

    @Override
    public DefaultConversationResponse getDefaultConversation() {
        return null;
    }

    @Override
    public GetUserInfosResponse getUserInfos(String params) {
        return null;
    }

    @Override
    public QiNiuTokenResponse getQiNiuToken() {
        return null;
    }

    @Override
    public VersionResponse getClientVersion() {
        return null;
    }

    @Override
    public SyncTotalDataResponse syncTotalData(String version) {
        return null;
    }

    @Override
    public byte[] downloadPic(String url) {
        return new byte[0];
    }
}
