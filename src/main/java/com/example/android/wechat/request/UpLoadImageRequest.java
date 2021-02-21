package com.example.android.wechat.request;

/**
 * Created by Chris on 16/4/5.
 *
 */
public class UpLoadImageRequest {

    private byte[] data;
    private String key;
    private String token;

    public UpLoadImageRequest(byte[] data, String key, String token) {
        this.data = data;
        this.key = key;
        this.token = token;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
