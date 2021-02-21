package com.example.android.wechat.request;

/**
 * Created by Chris on 16/1/25.
 *
 */
public class SetGroupPortraitRequest {

    private String groupId;
    private String portraitUri;

    public SetGroupPortraitRequest(String groupId, String portraitUri) {
        this.groupId = groupId;
        this.portraitUri = portraitUri;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPortraitUri() {
        return portraitUri;
    }

    public void setPortraitUri(String portraitUri) {
        this.portraitUri = portraitUri;
    }
}
