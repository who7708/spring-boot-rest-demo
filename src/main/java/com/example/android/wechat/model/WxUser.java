package com.example.android.wechat.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 *
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "wx_user", uniqueConstraints = {
        @UniqueConstraint(name = "uk_phone", columnNames = {"phone"}),
        @UniqueConstraint(name = "uk_user_id", columnNames = {"user_id"}),
        @UniqueConstraint(name = "uk_nickname", columnNames = {"nickname"})
})
public class WxUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;

    @Column(name = "user_id")
    private String userId;
    private String password;
    private String region;
    private String nickname;

    @Column(name = "portrait_uri")
    private String portraitUri;

    private int status;

    @Column(name = "delete_flag")
    private int deleteFlag;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
