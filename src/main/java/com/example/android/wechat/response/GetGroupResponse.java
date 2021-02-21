package com.example.android.wechat.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Chris on 16/1/26.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetGroupResponse {

    /**
     * code : 200
     * result : [{"role":0,"group":{"id":"pG4lQsHkY","name":"我的群","portraitUri":"","creatorId":"7w0UxC8IB","memberCount":7}},{"role":0,"group":{"id":"lzKDPFE3i","name":"我的","portraitUri":"","creatorId":"7w0UxC8IB","memberCount":7}},{"role":0,"group":{"id":"4UhxOBTZD","name":"你好啊","portraitUri":"","creatorId":"7w0UxC8IB","memberCount":5}},{"role":0,"group":{"id":"ktbmrlZxf","name":"你好啊","portraitUri":"","creatorId":"7w0UxC8IB","memberCount":5}},{"role":0,"group":{"id":"ArVtlWJSv","name":"你好","portraitUri":"","creatorId":"7w0UxC8IB","memberCount":5}},{"role":0,"group":{"id":"HMo0KF3AS","name":"啦啦啦","portraitUri":"http://rongcloud-image.ronghub.com/image_jpeg__RC-0116-00-26_115_1453797774?e=2147483647&token=CddrKW5AbOMQaDRwc3ReDNvo3-sL_SO1fSUBKV3H:An7uUCZEfnKxDU2uISg9BOKLz_8=","creatorId":"7w0UxC8IB","memberCount":4}},{"role":0,"group":{"id":"Y0QuryHAb","name":"啦啦","portraitUri":"http://rongcloud-image.ronghub.com/image_jpeg__RC-0116-00-26_115_1453797774?e=2147483647&token=CddrKW5AbOMQaDRwc3ReDNvo3-sL_SO1fSUBKV3H:An7uUCZEfnKxDU2uISg9BOKLz_8=","creatorId":"7w0UxC8IB","memberCount":4}},{"role":0,"group":{"id":"hrj7RzKxY","name":"啦啦闷骚","portraitUri":"http://rongcloud-image.ronghub.com/image_jpeg__RC-0116-00-26_115_1453797774?e=2147483647&token=CddrKW5AbOMQaDRwc3ReDNvo3-sL_SO1fSUBKV3H:An7uUCZEfnKxDU2uISg9BOKLz_8=","creatorId":"7w0UxC8IB","memberCount":4}},{"role":0,"group":{"id":"xdCTWNFJg","name":"秦秦秦","portraitUri":"http://rongcloud-image.ronghub.com/image_jpeg__RC-0116-00-26_166_1453798245?e=2147483647&token=livk5rb3__JZjCtEiMxXpQ8QscLxbNLehwhHySnX:pJ6hKxxGBlIRz1zXXOjmrZ6H60w=","creatorId":"7w0UxC8IB","memberCount":4}}]
     */
    private int code;

    /**
     * role : 0
     * group : {"id":"pG4lQsHkY","name":"我的群","portraitUri":"","creatorId":"7w0UxC8IB","memberCount":7}
     */
    private List<ResultEntity> results;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ResultEntity {
        private int role;  //'0: 创建者, 1: 普通成员'
        /**
         * id : pG4lQsHkY
         * name : 我的群
         * portraitUri :
         * creatorId : 7w0UxC8IB
         * memberCount : 7
         */
        private GroupEntity group;

        @Data
        @Builder
        @AllArgsConstructor
        @NoArgsConstructor
        public static class GroupEntity {
            private String id;
            private String name;
            private String portraitUri;
            private String creatorId;
            private int memberCount;
        }
    }
}
