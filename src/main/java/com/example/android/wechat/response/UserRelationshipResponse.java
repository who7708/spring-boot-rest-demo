package com.example.android.wechat.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Chris on 16/1/7.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRelationshipResponse {

    /**
     * code : 200
     * result : [{"displayName":"","message":"手机号:18622222222昵称:的用户请求添加你为好友","status":11,"updatedAt":"2016-01-07T06:22:55.000Z","user":{"id":"i3gRfA1ml","nickname":"nihaoa","portraitUri":""}}]
     */
    private int code;

    /**
     * displayName :
     * message : 手机号:18622222222昵称:的用户请求添加你为好友
     * status : 11
     * updatedAt : 2016-01-07T06:22:55.000Z
     * user : {"id":"i3gRfA1ml","nickname":"nihaoa","portraitUri":""}
     */
    private List<ResultEntity> results;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResultEntity implements Comparable {
        private String displayName;
        private String message;
        private int status;
        private String updatedAt;
        // this.mPinyin = PinyinUtils.getPinyin(displayName);
        private String pinyin;
        /**
         * id : i3gRfA1ml
         * nickname : nihaoa
         * portraitUri :
         */
        private UserEntity user;

        @Override
        public int compareTo(Object another) {
            return 0;
        }

        @Data
        @Builder
        @AllArgsConstructor
        @NoArgsConstructor
        public static class UserEntity {
            private String id;
            private String nickname;
            private String portraitUri;
        }
    }
}

