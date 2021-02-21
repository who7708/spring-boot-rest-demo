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
 * 群信息
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
@Table(name = "wx_group")
public class WxGroup implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long owner;
    private String portraitUri;

    private int status;

    @Column(name = "delete_flag")
    private int deleteFlag;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
// CREATE TABLE `wx_group` (
//   `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '群组id。group.id',
//   `name` varchar(50) NOT NULL DEFAULT '' COMMENT '群名称',
//   `owner` bigint(20) NOT NULL DEFAULT '0' COMMENT '群主',
//   `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '群组状态，0-正常，1-取消',
//   `delete_flag` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态，0-未删除，1-已删除',
//   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
//   `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;