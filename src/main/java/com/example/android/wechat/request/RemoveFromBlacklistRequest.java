package com.example.android.wechat.request;

/**
 * Created by Chris on 16/3/4.
 *
 */
public class RemoveFromBlacklistRequest {

    private String friendId;

    public RemoveFromBlacklistRequest(String friendId) {
        this.friendId = friendId;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }
}
