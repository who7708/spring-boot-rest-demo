package com.example.android.wechat.request;

/**
 * Created by Chris on 16/1/18.
 *
 */
public class SetNameRequest {

    private String nickname;

    public SetNameRequest(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
