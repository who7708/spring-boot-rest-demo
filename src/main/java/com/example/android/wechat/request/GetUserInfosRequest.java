package com.example.android.wechat.request;

import java.util.List;

/**
 * Created by Chris on 16/5/23.
 *
 */
public class GetUserInfosRequest {
    private List<String> querystring;

    public List<String> getQuerystring() {
        return querystring;
    }

    public void setQuerystring(List<String> querystring) {
        this.querystring = querystring;
    }

    public GetUserInfosRequest(List<String> querystring) {
        this.querystring = querystring;
    }
}
