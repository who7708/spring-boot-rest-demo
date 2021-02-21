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
import java.io.Serializable;
import java.util.Date;

/**
 * 群用户信息
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
@Table(name = "wx_group_user")
public class WxGroupUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long gid;
    private Long uid;

    private int admin;

    private int status;

    @Column(name = "delete_flag")
    private int deleteFlag;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
// CREATE TABLE `wx_group_user` (
//   `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '群组id',
//   `gid` bigint(20) NOT NULL DEFAULT '0' COMMENT '关联群id，wx_group.id',
//   `uid` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户id，对应wx_user.id',
//   `admin` tinyint(4) NOT NULL DEFAULT '0' COMMENT '管理员，0-否，1-是',
//   `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '群组状态，0-正常，1-取消',
//   `delete_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态，0-未删除，1-已删除',
//   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
//   `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;