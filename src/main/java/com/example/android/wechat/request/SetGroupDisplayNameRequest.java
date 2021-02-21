package com.example.android.wechat.request;

/**
 * Created by Chris on 16/2/2.
 *
 */
public class SetGroupDisplayNameRequest {

    private String groupId;
    private String displayName;

    public SetGroupDisplayNameRequest(String groupId, String displayName) {
        this.groupId = groupId;
        this.displayName = displayName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
