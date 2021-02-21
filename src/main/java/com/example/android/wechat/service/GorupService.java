package com.example.android.wechat.service;

import com.example.android.wechat.request.AddGroupMemberRequest;
import com.example.android.wechat.request.CreateGroupRequest;
import com.example.android.wechat.request.DeleteGroupMemberRequest;
import com.example.android.wechat.request.JoinGroupRequest;
import com.example.android.wechat.request.QuitGroupRequest;
import com.example.android.wechat.request.SetGroupDisplayNameRequest;
import com.example.android.wechat.request.SetGroupNameRequest;
import com.example.android.wechat.request.SetGroupPortraitRequest;
import com.example.android.wechat.response.AddGroupMemberResponse;
import com.example.android.wechat.response.CreateGroupResponse;
import com.example.android.wechat.response.DeleteGroupMemberResponse;
import com.example.android.wechat.response.GetGroupInfoResponse;
import com.example.android.wechat.response.GetGroupMemberResponse;
import com.example.android.wechat.response.GetGroupResponse;
import com.example.android.wechat.response.JoinGroupResponse;
import com.example.android.wechat.response.QuitGroupResponse;
import com.example.android.wechat.response.SetGroupDisplayNameResponse;
import com.example.android.wechat.response.SetGroupNameResponse;
import com.example.android.wechat.response.SetGroupPortraitResponse;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/22
 */
public interface GorupService {
    /**
     * 创建群组
     *
     * \@POST("group/create")
     */
    CreateGroupResponse createGroup(CreateGroupRequest request);

    /**
     * 创建者设置群组头像
     *
     * \@POST("group/set_portrait_uri")
     */
    SetGroupPortraitResponse setGroupPortrait(SetGroupPortraitRequest request);

    /**
     * 获取当前用户所属群组列表
     *
     * \@GET("user/{userId}/groups")
     */
    GetGroupResponse getGroups(Long userId);

    /**
     * 根据 群组id 查询该群组信息   403 群组成员才能看
     *
     * \@GET("group/{groupId}")
     */
    GetGroupInfoResponse getGroupInfo(String groupId);

    /**
     * 根据群id获取群组成员
     *
     * \@GET("group/{groupId}/members")
     * @param groupId
     */
    GetGroupMemberResponse getGroupMember(Long groupId);

    /**
     * 当前用户添加群组成员
     *
     * \@POST("group/add")
     */
    AddGroupMemberResponse addGroupMember(AddGroupMemberRequest request);

    /**
     * 创建者将群组成员提出群组
     *
     * \@POST("group/kick")
     */
    DeleteGroupMemberResponse deleGroupMember(DeleteGroupMemberRequest request);

    /**
     * 创建者更改群组昵称
     *
     * \@POST("group/rename")
     */
    SetGroupNameResponse setGroupName(SetGroupNameRequest request);

    /**
     * 用户自行退出群组
     *
     * \@POST("group/quit")
     */
    QuitGroupResponse quitGroup(QuitGroupRequest request);

    /**
     * 创建者解散群组
     *
     * \@POST("group/dismiss")
     */
    QuitGroupResponse dissmissGroup(QuitGroupRequest request);

    /**
     * DismissGroupResponse dissmissGroup( request);
     *
     * /**修改自己的当前的群昵称
     *
     * \@POST("group/set_display_name")
     */
    SetGroupDisplayNameResponse setGroupDisplayName(SetGroupDisplayNameRequest request);

    /**
     * 当前用户加入某群组
     *
     * \@POST("group/join")
     */
    JoinGroupResponse joinGroup(JoinGroupRequest request);
}
