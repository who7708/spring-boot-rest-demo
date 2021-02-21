package com.example.android.wechat.service;

import com.example.android.wechat.request.AgreeFriendsRequest;
import com.example.android.wechat.request.DeleteFriendRequest;
import com.example.android.wechat.request.FriendInvitationRequest;
import com.example.android.wechat.request.SetFriendDisplayNameRequest;
import com.example.android.wechat.response.AgreeFriendsResponse;
import com.example.android.wechat.response.DeleteFriendResponse;
import com.example.android.wechat.response.FriendInvitationResponse;
import com.example.android.wechat.response.GetFriendInfoByIDResponse;
import com.example.android.wechat.response.SetFriendDisplayNameResponse;
import com.example.android.wechat.response.UserRelationshipResponse;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/22
 */
public interface FriendShipService {
    /**
     * 发送好友邀请
     *
     * \@POST("friendship/invite")
     */
    FriendInvitationResponse sendFriendInvitation(FriendInvitationRequest request);

    /**
     * 获取发生过用户关系的列表
     *
     * \@GET("friendship/all")
     * @param userId
     */
    UserRelationshipResponse getAllUserRelationship(Long userId);

    /**
     * 根据userId去服务器查询好友信息
     *
     * \@GET("friendship/{userid}/profile")
     */
    GetFriendInfoByIDResponse getFriendInfoByID(String userid);

    /**
     * 同意对方好友邀请
     *
     * \@POST("friendship/agree")
     */
    AgreeFriendsResponse agreeFriends(AgreeFriendsRequest request);

    /**
     * 删除好友
     *
     * \@POST("friendship/delete")
     */
    DeleteFriendResponse deleteFriend(DeleteFriendRequest request);

    /**
     * 设置好友的备注名称
     *
     * \@POST("friendship/set_display_name")
     */
    SetFriendDisplayNameResponse setFriendDisplayName(SetFriendDisplayNameRequest request);

}
