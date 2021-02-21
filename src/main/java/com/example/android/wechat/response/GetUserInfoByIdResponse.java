package com.example.android.wechat.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Chris on 16/1/4.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUserInfoByIdResponse {

    /**
     * code : 200
     * result : {"id":"10YVscJI3","nickname":"阿明","portraitUri":""}
     */
    private int code;

    /**
     * id : 10YVscJI3
     * nickname : 阿明
     * portraitUri :
     */
    private ResultEntity result;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResultEntity {
        private String id;
        private String nickname;
        private String portraitUri;
    }
}
