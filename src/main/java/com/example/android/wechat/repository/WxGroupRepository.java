package com.example.android.wechat.repository;

import com.example.android.wechat.model.WxGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@Repository
public interface WxGroupRepository extends JpaRepository<WxGroup, Long> {
}
