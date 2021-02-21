package com.example.android.wechat.repository;

import com.example.android.wechat.model.WxUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@Repository
public interface WxUserRepository extends JpaRepository<WxUser, Long> {
    WxUser findFirstByRegionAndPhoneAndPassword(String region, String phone, String password);

    // WxUser findFirstByPhone(String phone);

    // WxUser findFirstByUserId(String userId);
}
