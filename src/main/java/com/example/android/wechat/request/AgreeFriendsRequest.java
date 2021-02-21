package com.example.android.wechat.request;

/**
 * Created by Chris on 16/1/8.
 *
 */
public class AgreeFriendsRequest {

    private String friendId;

    public AgreeFriendsRequest(String friendId) {
        this.friendId = friendId;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }
}
