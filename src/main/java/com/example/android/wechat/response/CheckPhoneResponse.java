package com.example.android.wechat.response;

/**
 * Created by Chris on 15/12/22.
 */
public class CheckPhoneResponse {

    private int code;

    private boolean result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
