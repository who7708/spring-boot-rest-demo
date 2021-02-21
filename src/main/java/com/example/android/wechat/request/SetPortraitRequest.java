package com.example.android.wechat.request;

/**
 * Created by Chris on 16/1/13.
 *
 */
public class SetPortraitRequest {

    private String portraitUri;

    public SetPortraitRequest(String portraitUri) {
        this.portraitUri = portraitUri;
    }

    public String getPortraitUri() {
        return portraitUri;
    }

    public void setPortraitUri(String portraitUri) {
        this.portraitUri = portraitUri;
    }
}
