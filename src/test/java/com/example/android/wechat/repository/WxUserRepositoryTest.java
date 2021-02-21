package com.example.android.wechat.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@SpringBootTest
public class WxUserRepositoryTest {

    @Autowired
    private WxUserRepository wxUserRepository;

    @Test
    public void test1() {
        System.out.println("===== test1 =====");
        wxUserRepository.findById(1L).ifPresent(System.out::println);
    }
}