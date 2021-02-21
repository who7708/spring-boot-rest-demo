package com.example.android.wechat.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Chris on 16/1/25.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateGroupResponse {

    /**
     * code : 200
     * result : {"id":"ArVtlWJSv"}
     */
    private int code;
    /**
     * id : ArVtlWJSv
     */
    private ResultEntity result;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResultEntity {
        private String id;
    }
}
