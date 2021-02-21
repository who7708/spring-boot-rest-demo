// package com.example.android.wechat.service;
//
// import com.example.android.wechat.request.AddGroupMemberRequest;
// import com.example.android.wechat.request.AddToBlackListRequest;
// import com.example.android.wechat.request.AgreeFriendsRequest;
// import com.example.android.wechat.request.ChangePasswordRequest;
// import com.example.android.wechat.request.CheckPhoneRequest;
// import com.example.android.wechat.request.CreateGroupRequest;
// import com.example.android.wechat.request.DeleteFriendRequest;
// import com.example.android.wechat.request.DeleteGroupMemberRequest;
// import com.example.android.wechat.request.FriendInvitationRequest;
// import com.example.android.wechat.request.JoinGroupRequest;
// import com.example.android.wechat.request.LoginRequest;
// import com.example.android.wechat.request.QuitGroupRequest;
// import com.example.android.wechat.request.RegisterRequest;
// import com.example.android.wechat.request.RemoveFromBlacklistRequest;
// import com.example.android.wechat.request.RestPasswordRequest;
// import com.example.android.wechat.request.SendCodeRequest;
// import com.example.android.wechat.request.SetFriendDisplayNameRequest;
// import com.example.android.wechat.request.SetGroupDisplayNameRequest;
// import com.example.android.wechat.request.SetGroupNameRequest;
// import com.example.android.wechat.request.SetGroupPortraitRequest;
// import com.example.android.wechat.request.SetNameRequest;
// import com.example.android.wechat.request.SetPortraitRequest;
// import com.example.android.wechat.request.VerifyCodeRequest;
// import com.example.android.wechat.response.AddGroupMemberResponse;
// import com.example.android.wechat.response.AddToBlackListResponse;
// import com.example.android.wechat.response.AgreeFriendsResponse;
// import com.example.android.wechat.response.ChangePasswordResponse;
// import com.example.android.wechat.response.CheckPhoneResponse;
// import com.example.android.wechat.response.CreateGroupResponse;
// import com.example.android.wechat.response.DefaultConversationResponse;
// import com.example.android.wechat.response.DeleteFriendResponse;
// import com.example.android.wechat.response.DeleteGroupMemberResponse;
// import com.example.android.wechat.response.FriendInvitationResponse;
// import com.example.android.wechat.response.GetBlackListResponse;
// import com.example.android.wechat.response.GetFriendInfoByIDResponse;
// import com.example.android.wechat.response.GetGroupInfoResponse;
// import com.example.android.wechat.response.GetGroupMemberResponse;
// import com.example.android.wechat.response.GetGroupResponse;
// import com.example.android.wechat.response.GetTokenResponse;
// import com.example.android.wechat.response.GetUserInfoByIdResponse;
// import com.example.android.wechat.response.GetUserInfoByPhoneResponse;
// import com.example.android.wechat.response.GetUserInfosResponse;
// import com.example.android.wechat.response.JoinGroupResponse;
// import com.example.android.wechat.response.LoginResponse;
// import com.example.android.wechat.response.QiNiuTokenResponse;
// import com.example.android.wechat.response.QuitGroupResponse;
// import com.example.android.wechat.response.RegisterResponse;
// import com.example.android.wechat.response.RemoveFromBlackListResponse;
// import com.example.android.wechat.response.RestPasswordResponse;
// import com.example.android.wechat.response.SendCodeResponse;
// import com.example.android.wechat.response.SetFriendDisplayNameResponse;
// import com.example.android.wechat.response.SetGroupDisplayNameResponse;
// import com.example.android.wechat.response.SetGroupNameResponse;
// import com.example.android.wechat.response.SetGroupPortraitResponse;
// import com.example.android.wechat.response.SetNameResponse;
// import com.example.android.wechat.response.SetPortraitResponse;
// import com.example.android.wechat.response.SyncTotalDataResponse;
// import com.example.android.wechat.response.UserRelationshipResponse;
// import com.example.android.wechat.response.VerifyCodeResponse;
// import com.example.android.wechat.response.VersionResponse;
//
// /**
//  * @author Chris
//  * @version 1.0.0
//  * @since 2021/02/21
//  */
// public interface WechatService2 {
//     /**
//      * 检查手机是否被注册
//      *
//      * \@POST("user/check_phone_available")
//      */
//     CheckPhoneResponse checkPhoneAvailable(CheckPhoneRequest request);
//
//     /**
//      * 发送验证码
//      *
//      * \@POST("user/send_code")
//      */
//     SendCodeResponse sendCode(SendCodeRequest request);
//
//     /**
//      * 验证验证码是否正确(必选先用手机号码调sendcode)
//      *
//      * \@POST("user/verify_code")
//      */
//     VerifyCodeResponse verifyCode(VerifyCodeRequest request);
//
//     /**
//      * 注册
//      *
//      * \@POST("user/register")
//      */
//     RegisterResponse register(RegisterRequest request);
//
//     /**
//      * 登录
//      *
//      * \@POST("user/login")
//      */
//     LoginResponse login(LoginRequest request);
//
//     /**
//      * 获取 token 前置条件需要登录   502 坏的网关 测试环境用户已达上限
//      *
//      * \@GET("user/get_token")
//      */
//     GetTokenResponse getToken();
//
//     /**
//      * 设置自己的昵称
//      *
//      * \@POST("user/set_nickname")
//      */
//     SetNameResponse setName(SetNameRequest request);
//
//     /**
//      * 设置用户头像
//      *
//      * \@POST("user/set_portrait_uri")
//      */
//     SetPortraitResponse setPortrait(SetPortraitRequest request);
//
//     /**
//      * 当前登录用户通过旧密码设置新密码  前置条件需要登录才能访问
//      *
//      * \@POST("user/change_password")
//      */
//     ChangePasswordResponse changePassword(ChangePasswordRequest request);
//
//     /**
//      * 通过手机验证码重置密码
//      *
//      * \@POST("user/reset_password")
//      */
//     RestPasswordResponse restPassword(RestPasswordRequest request);
//
//     /**
//      * 根据 id 去服务端查询用户信息
//      *
//      * \@GET("user/{userid}")
//      */
//     GetUserInfoByIdResponse getUserInfoById(Long userid);
//
//     /**
//      * 通过国家码和手机号查询用户信息
//      *
//      * \@GET("user/find/{region}/{phone}")
//      */
//     GetUserInfoByPhoneResponse getUserInfoFromPhone(String region, String phone);
//
//     /**
//      * 发送好友邀请
//      *
//      * \@POST("friendship/invite")
//      */
//     FriendInvitationResponse sendFriendInvitation(FriendInvitationRequest request);
//
//     /**
//      * 获取发生过用户关系的列表
//      *
//      * \@GET("friendship/all")
//      * @param userId
//      */
//     UserRelationshipResponse getAllUserRelationship(Long userId);
//
//     /**
//      * 根据userId去服务器查询好友信息
//      *
//      * \@GET("friendship/{userid}/profile")
//      */
//     GetFriendInfoByIDResponse getFriendInfoByID(String userid);
//
//     /**
//      * 同意对方好友邀请
//      *
//      * \@POST("friendship/agree")
//      */
//     AgreeFriendsResponse agreeFriends(AgreeFriendsRequest request);
//
//     /**
//      * 删除好友
//      *
//      * \@POST("friendship/delete")
//      */
//     DeleteFriendResponse deleteFriend(DeleteFriendRequest request);
//
//     /**
//      * 设置好友的备注名称
//      *
//      * \@POST("friendship/set_display_name")
//      */
//     SetFriendDisplayNameResponse setFriendDisplayName(SetFriendDisplayNameRequest request);
//
//     /**
//      * 获取黑名单
//      *
//      * \@GET("user/blacklist")
//      */
//     GetBlackListResponse getBlackList();
//
//     /**
//      * 加入黑名单
//      *
//      * \@POST("user/add_to_blacklist")
//      */
//     AddToBlackListResponse addToBlackList(AddToBlackListRequest request);
//
//     /**
//      * 移除黑名单
//      *
//      * \@POST("user/remove_from_blacklist")
//      */
//     RemoveFromBlackListResponse removeFromBlackList(RemoveFromBlacklistRequest request);
//
//     /**
//      * 创建群组
//      *
//      * \@POST("group/create")
//      */
//     CreateGroupResponse createGroup(CreateGroupRequest request);
//
//     /**
//      * 创建者设置群组头像
//      *
//      * \@POST("group/set_portrait_uri")
//      */
//     SetGroupPortraitResponse setGroupPortrait(SetGroupPortraitRequest request);
//
//     /**
//      * 获取当前用户所属群组列表
//      *
//      * \@GET("user/{userId}/groups")
//      */
//     GetGroupResponse getGroups(Long userId);
//
//     /**
//      * 根据 群组id 查询该群组信息   403 群组成员才能看
//      *
//      * \@GET("group/{groupId}")
//      */
//     GetGroupInfoResponse getGroupInfo(String groupId);
//
//     /**
//      * 根据群id获取群组成员
//      *
//      * \@GET("group/{groupId}/members")
//      */
//     GetGroupMemberResponse getGroupMember(String groupId);
//
//     /**
//      * 当前用户添加群组成员
//      *
//      * \@POST("group/add")
//      */
//     AddGroupMemberResponse addGroupMember(AddGroupMemberRequest request);
//
//     /**
//      * 创建者将群组成员提出群组
//      *
//      * \@POST("group/kick")
//      */
//     DeleteGroupMemberResponse deleGroupMember(DeleteGroupMemberRequest request);
//
//     /**
//      * 创建者更改群组昵称
//      *
//      * \@POST("group/rename")
//      */
//     SetGroupNameResponse setGroupName(SetGroupNameRequest request);
//
//     /**
//      * 用户自行退出群组
//      *
//      * \@POST("group/quit")
//      */
//     QuitGroupResponse quitGroup(QuitGroupRequest request);
//
//     /**
//      * 创建者解散群组
//      *
//      * \@POST("group/dismiss")
//      */
//     QuitGroupResponse dissmissGroup(QuitGroupRequest request);
//
//     /**
//      * DismissGroupResponse dissmissGroup( request);
//      *
//      * /**修改自己的当前的群昵称
//      *
//      * \@POST("group/set_display_name")
//      */
//     SetGroupDisplayNameResponse setGroupDisplayName(SetGroupDisplayNameRequest request);
//
//     /**
//      * 当前用户加入某群组
//      *
//      * \@POST("group/join")
//      */
//     JoinGroupResponse joinGroup(JoinGroupRequest request);
//
//     /**
//      * 获取默认群组 和 聊天室
//      *
//      * \@GET("misc/demo_square")
//      */
//     DefaultConversationResponse getDefaultConversation();
//
//     /**
//      * 根据一组ids 获取 一组用户信息
//      *
//      * \@GET("user/batch?{params}")
//      */
//     GetUserInfosResponse getUserInfos(String params);
//
//     /**
//      * 得到七牛的token
//      *
//      * \@GET("user/get_image_token")
//      */
//     QiNiuTokenResponse getQiNiuToken();
//
//     /**
//      * 获取版本信息
//      *
//      * \@GET("misc/client_version")
//      */
//     VersionResponse getClientVersion();
//
//     /**
//      * \@GET("user/sync/{version}")
//      */
//     SyncTotalDataResponse syncTotalData(String version);
//
//     /**
//      * 下载图片
//      */
//     byte[] downloadPic(String url);
// }
