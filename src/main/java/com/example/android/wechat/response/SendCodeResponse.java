package com.example.android.wechat.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Chris on 15/12/23.
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SendCodeResponse {

    private int code;
}
