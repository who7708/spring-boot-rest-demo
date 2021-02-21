package com.example.android.wechat.service.impl;

import com.example.android.wechat.manage.GroupManager;
import com.example.android.wechat.repository.WxGroupRepository;
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
import com.example.android.wechat.service.GorupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@Service
public class GroupServiceImpl implements GorupService {

    @Autowired
    private WxGroupRepository wxGroupRepository;

    @Autowired
    private GroupManager groupManager;

    @Override
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        return null;
    }

    @Override
    public SetGroupPortraitResponse setGroupPortrait(SetGroupPortraitRequest request) {
        return null;
    }

    @Override
    public GetGroupResponse getGroups(Long userId) {
        if (userId > 0) {
            return groupManager.getGroupsByUserId(userId);
        }
        return null;
    }

    @Override
    public GetGroupInfoResponse getGroupInfo(String groupId) {
        return null;
    }

    @Override
    public GetGroupMemberResponse getGroupMember(Long groupId) {
        if (groupId > 0) {
            return groupManager.getGroupMemberById(groupId);
        }
        return null;
    }

    @Override
    public AddGroupMemberResponse addGroupMember(AddGroupMemberRequest request) {
        return null;
    }

    @Override
    public DeleteGroupMemberResponse deleGroupMember(DeleteGroupMemberRequest request) {
        return null;
    }

    @Override
    public SetGroupNameResponse setGroupName(SetGroupNameRequest request) {
        return null;
    }

    @Override
    public QuitGroupResponse quitGroup(QuitGroupRequest request) {
        return null;
    }

    @Override
    public QuitGroupResponse dissmissGroup(QuitGroupRequest request) {
        return null;
    }

    @Override
    public SetGroupDisplayNameResponse setGroupDisplayName(SetGroupDisplayNameRequest request) {
        return null;
    }

    @Override
    public JoinGroupResponse joinGroup(JoinGroupRequest request) {
        return null;
    }
}
