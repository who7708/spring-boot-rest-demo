package com.example.android.wechat.repository;

import com.example.android.wechat.model.WxGroupUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@Repository
public interface WxGroupUserRepository extends JpaRepository<WxGroupUser, Long> {
    List<WxGroupUser> findByUid(Long userId);

    int countByGid(Long gid);

    List<WxGroupUser> findByGid(Long groupId);
}
