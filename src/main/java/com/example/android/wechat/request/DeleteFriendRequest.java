package com.example.android.wechat.request;

/**
 * Created by Chris on 16/2/17.
 *
 */
public class DeleteFriendRequest {
    private String friendId;

    public DeleteFriendRequest(String friendId) {
        this.friendId = friendId;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }
}
