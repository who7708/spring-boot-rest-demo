package com.example.android.wechat.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Chris on 15/12/22.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VerifyCodeResponse {

    /**
     * code : 200
     * result : {"verification_token":"86bd3a00-b80a-11e5-b5ab-433619959d67"}
     */

    private int code;
    /**
     * verification_token : 86bd3a00-b80a-11e5-b5ab-433619959d67
     */

    private ResultEntity result;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResultEntity {
        private String verification_token;
    }
}
