package com.example.android.test.dynamicinject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/**
* spring bean 动态注册及删除
*/
@SpringBootApplication
public class DynamicInjectTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                .web(WebApplicationType.NONE)
                .run(args);
        // ApplicationContext ctx = SpringApplication.run(Application.class, args);

        // 获取BeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) ctx
                .getAutowireCapableBeanFactory();

        // 创建bean信息.
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TestService.class);
        beanDefinitionBuilder.addPropertyValue("name", "张三");
        // 动态注册bean.
        defaultListableBeanFactory.registerBeanDefinition("testService", beanDefinitionBuilder.getBeanDefinition());

        // 获取动态注册的bean.
        TestService testService = ctx.getBean(TestService.class);
        testService.print();
        System.out.println(ctx.getBeanDefinitionCount());

        // 相对于动态注入，动态删除就很简单了
        // 删除bean.
        defaultListableBeanFactory.removeBeanDefinition("testService");
        System.out.println(ctx.getBeanDefinitionCount());

        testService = ctx.getBean(TestService.class);
        testService.print();
    }

    private static class TestService {

        @Autowired
        private ApplicationContext ctx;

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void print() {
            System.out.println(ctx.getBeanDefinitionCount());
            System.out.println("动态载入bean,name=" + name);
        }

    }
}
