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
// CREATE TABLE `wx_user` (
//   `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
//   `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
//   `user_id` varchar(11) NOT NULL DEFAULT '' COMMENT '用户id',
//   `password` varchar(20) NOT NULL DEFAULT '' COMMENT '用户密码',
//   `nickname` varchar(100) NOT NULL DEFAULT '' COMMENT '昵称',
//   `portrait_uri` varchar(100) DEFAULT 'portrait.png' COMMENT '头像',
//   `region` varchar(5) DEFAULT NULL COMMENT '手机号所属地区，中国-86',
//   `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户状态，0-正常，1-注销，2-冻结',
//   `delete_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态，0-未删除，1-已删除',
//   `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
//   `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
//   PRIMARY KEY (`id`),
//   KEY `uk_user_id` (`user_id`),
//   KEY `uk_phone` (`phone`),
//   KEY `uk_nickname` (`nickname`)
// ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
