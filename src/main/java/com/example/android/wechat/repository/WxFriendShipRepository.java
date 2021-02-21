package com.example.android.wechat.repository;

import com.example.android.wechat.model.WxFriendShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@Repository
public interface WxFriendShipRepository extends JpaRepository<WxFriendShip, Long> {
    List<WxFriendShip> findByPid(Long pid);
}
