package com.example.android.wechat.rest;

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
import com.example.android.wechat.service.FriendShipService;
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
public class FriendShipController {
    @Autowired
    private FriendShipService friendShipService;

    @PostMapping("/friendship/invite")
    public FriendInvitationResponse sendFriendInvitation(@RequestBody @Valid FriendInvitationRequest request) {
        return friendShipService.sendFriendInvitation(request);
    }

    @GetMapping("/friendship/{userId}/all")
    public UserRelationshipResponse getAllUserRelationship(@PathVariable("userId") Long userId) {
        return friendShipService.getAllUserRelationship(userId);
    }

    @GetMapping("/friendship/{userid}/profile")
    public GetFriendInfoByIDResponse getFriendInfoByID(@PathVariable("userid") String userid) {
        return friendShipService.getFriendInfoByID(userid);
    }

    @PostMapping("/friendship/agree")
    public AgreeFriendsResponse agreeFriends(@RequestBody @Valid AgreeFriendsRequest request) {
        return friendShipService.agreeFriends(request);
    }

    @PostMapping("/friendship/delete")
    public DeleteFriendResponse deleteFriend(@RequestBody @Valid DeleteFriendRequest request) {
        return friendShipService.deleteFriend(request);
    }

    @PostMapping("/friendship/set_display_name")
    public SetFriendDisplayNameResponse setFriendDisplayName(@RequestBody @Valid SetFriendDisplayNameRequest request) {
        return friendShipService.setFriendDisplayName(request);
    }
}
