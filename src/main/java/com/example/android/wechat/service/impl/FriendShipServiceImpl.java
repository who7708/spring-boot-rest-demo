package com.example.android.wechat.service.impl;

import com.example.android.wechat.manage.FriendManager;
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
import org.springframework.stereotype.Service;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@Service
public class FriendShipServiceImpl implements FriendShipService {

    @Autowired
    private FriendManager friendManager;

    @Override
    public FriendInvitationResponse sendFriendInvitation(FriendInvitationRequest request) {
        return null;
    }

    @Override
    public UserRelationshipResponse getAllUserRelationship(Long userId) {
        if (userId > 0) {
            return friendManager.getUserRelationShipByUserId(userId);
        }
        return null;
    }

    @Override
    public GetFriendInfoByIDResponse getFriendInfoByID(String userid) {
        return null;
    }

    @Override
    public AgreeFriendsResponse agreeFriends(AgreeFriendsRequest request) {
        return null;
    }

    @Override
    public DeleteFriendResponse deleteFriend(DeleteFriendRequest request) {
        return null;
    }

    @Override
    public SetFriendDisplayNameResponse setFriendDisplayName(SetFriendDisplayNameRequest request) {
        return null;
    }
}
