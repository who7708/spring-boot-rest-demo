package com.example.android.rest;

import com.example.android.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
@Slf4j
@RequestMapping("/student")
@RestController
public class StudentController {
    private static final String[] NAME_PREFIX = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "m"};

    private static final Map<Integer, Student> STUDENT_MAP = new HashMap<>();

    static {
        for (int i = 0; i < 100; i++) {
            STUDENT_MAP.put(i + 1, Student.builder()
                    .id(i + 1)
                    .name(NAME_PREFIX[(int) (Math.random() * 10)] + "student")
                    .age(((int) (Math.random() * 103)) + 7)
                    .build());
        }
    }

    @GetMapping("/{id}")
    public Student detail(@PathVariable("id") int id, HttpServletRequest request) {
        log.info("detail id {}", id);
        final Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            final String headerName = headerNames.nextElement();
            final String headerValue = request.getHeader(headerName);
            log.info("header: {}:{}", headerName, headerValue);
        }
        try {
            TimeUnit.SECONDS.sleep((int) (Math.random() * 10) + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return STUDENT_MAP.get(id);
    }

    @GetMapping("/all")
    public Collection<Student> list() {
        log.info("student all");
        try {
            TimeUnit.SECONDS.sleep((int) (Math.random() * 10) + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return STUDENT_MAP.values();
    }
}
