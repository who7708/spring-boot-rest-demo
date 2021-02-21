package com.example.android.wechat.service;

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

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/22
 */
public interface UserService {


    /**
     * 获取 token 前置条件需要登录   502 坏的网关 测试环境用户已达上限
     *
     * \@GET("user/get_token")
     */
    GetTokenResponse getToken();

    /**
     * 设置自己的昵称
     *
     * \@POST("user/set_nickname")
     */
    SetNameResponse setName(SetNameRequest request);

    /**
     * 设置用户头像
     *
     * \@POST("user/set_portrait_uri")
     */
    SetPortraitResponse setPortrait(SetPortraitRequest request);

    /**
     * 当前登录用户通过旧密码设置新密码  前置条件需要登录才能访问
     *
     * \@POST("user/change_password")
     */
    ChangePasswordResponse changePassword(ChangePasswordRequest request);

    /**
     * 通过手机验证码重置密码
     *
     * \@POST("user/reset_password")
     */
    RestPasswordResponse restPassword(RestPasswordRequest request);

    /**
     * 根据 id 去服务端查询用户信息
     *
     * \@GET("user/{userid}")
     */
    GetUserInfoByIdResponse getUserInfoById(Long userid);

    /**
     * 通过国家码和手机号查询用户信息
     *
     * \@GET("user/find/{region}/{phone}")
     */
    GetUserInfoByPhoneResponse getUserInfoFromPhone(String region, String phone);

    /**
     * 获取黑名单
     *
     * \@GET("user/blacklist")
     */
    GetBlackListResponse getBlackList();

    /**
     * 加入黑名单
     *
     * \@POST("user/add_to_blacklist")
     */
    AddToBlackListResponse addToBlackList(AddToBlackListRequest request);

    /**
     * 移除黑名单
     *
     * \@POST("user/remove_from_blacklist")
     */
    RemoveFromBlackListResponse removeFromBlackList(RemoveFromBlacklistRequest request);

}
