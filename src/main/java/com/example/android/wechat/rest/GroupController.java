package com.example.android.wechat.rest;

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
public class GroupController {
    @Autowired
    private GorupService gorupService;

    @GetMapping("/user/{userId}/groups")
    public GetGroupResponse getGroups(@PathVariable("userId") Long userId) {
        return gorupService.getGroups(userId);
    }

    @PostMapping("/group/create")
    public CreateGroupResponse createGroup(@RequestBody @Valid CreateGroupRequest request) {
        return gorupService.createGroup(request);
    }

    @PostMapping("/group/set_portrait_uri")
    public SetGroupPortraitResponse setGroupPortrait(@RequestBody @Valid SetGroupPortraitRequest request) {
        return gorupService.setGroupPortrait(request);
    }

    @GetMapping("/group/{groupId}")
    public GetGroupInfoResponse getGroupInfo(@PathVariable("groupId") String groupId) {
        return gorupService.getGroupInfo(groupId);
    }

    @GetMapping("/group/{groupId}/members")
    public GetGroupMemberResponse getGroupMember(@PathVariable("groupId") Long groupId) {
        return gorupService.getGroupMember(groupId);
    }

    @PostMapping("/group/add")
    public AddGroupMemberResponse addGroupMember(@RequestBody @Valid AddGroupMemberRequest request) {
        return gorupService.addGroupMember(request);
    }

    @PostMapping("/group/kick")
    public DeleteGroupMemberResponse deleGroupMember(@RequestBody @Valid DeleteGroupMemberRequest request) {
        return gorupService.deleGroupMember(request);
    }

    @PostMapping("/group/rename")
    public SetGroupNameResponse setGroupName(@RequestBody @Valid SetGroupNameRequest request) {
        return gorupService.setGroupName(request);
    }

    @PostMapping("/group/quit")
    public QuitGroupResponse quitGroup(@RequestBody @Valid QuitGroupRequest request) {
        return gorupService.quitGroup(request);
    }

    @PostMapping("/group/dismiss")
    public QuitGroupResponse dissmissGroup(@RequestBody @Valid QuitGroupRequest request) {
        return gorupService.dissmissGroup(request);
    }

    @PostMapping("/group/set_display_name")
    public SetGroupDisplayNameResponse setGroupDisplayName(@RequestBody @Valid SetGroupDisplayNameRequest request) {
        return gorupService.setGroupDisplayName(request);
    }

    @PostMapping("/group/join")
    public JoinGroupResponse joinGroup(@RequestBody @Valid JoinGroupRequest request) {
        return gorupService.joinGroup(request);
    }
}
