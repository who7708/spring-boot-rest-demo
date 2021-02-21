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
import java.util.Date;

/**
 * 用户好友
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
@Table(name = "wx_friend_ship", uniqueConstraints = {
        @UniqueConstraint(name = "uk_pid_cid", columnNames = {"pid", "cid"})
})
public class WxFriendShip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pid;
    private Long cid;
    private String markName;
    private String message;

    private int status;

    @Column(name = "delete_flag")
    private int deleteFlag;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
// CREATE TABLE `wx_friend_ship` (
//   `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
//   `pid` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '用户id，对应wx_user.id',
//   `cid` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '好友id，对应wx_user.id',
//   `mark_name` varchar(50) NOT NULL DEFAULT '' COMMENT '备注名称',
//   `message` varchar(50) NOT NULL DEFAULT '' COMMENT '加好友时的备注',
//   `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '好友状态，0-正常，1-取消',
//   `delete_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态，0-未删除，1-已删除',
//   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
//   `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
//   PRIMARY KEY (`id`),
//   KEY `uk_pid_cid` (`pid`,`cid`)
// ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;