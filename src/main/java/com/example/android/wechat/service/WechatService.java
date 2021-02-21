package com.example.android.wechat.service;

import com.example.android.wechat.response.DefaultConversationResponse;
import com.example.android.wechat.response.GetUserInfosResponse;
import com.example.android.wechat.response.QiNiuTokenResponse;
import com.example.android.wechat.response.SyncTotalDataResponse;
import com.example.android.wechat.response.VersionResponse;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
public interface WechatService {

    /**
     * 获取默认群组 和 聊天室
     *
     * \@GET("misc/demo_square")
     */
    DefaultConversationResponse getDefaultConversation();

    /**
     * 根据一组ids 获取 一组用户信息
     *
     * \@GET("user/batch?{params}")
     */
    GetUserInfosResponse getUserInfos(String params);

    /**
     * 得到七牛的token
     *
     * \@GET("user/get_image_token")
     */
    QiNiuTokenResponse getQiNiuToken();

    /**
     * 获取版本信息
     *
     * \@GET("misc/client_version")
     */
    VersionResponse getClientVersion();

    /**
     * \@GET("user/sync/{version}")
     */
    SyncTotalDataResponse syncTotalData(String version);

    /**
     * 下载图片
     */
    byte[] downloadPic(String url);
}
