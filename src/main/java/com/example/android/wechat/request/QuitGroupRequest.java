package com.example.android.wechat.request;

/**
 * Created by Chris on 16/1/29.
 *
 */
public class QuitGroupRequest {

    private String groupId;

    public QuitGroupRequest(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
