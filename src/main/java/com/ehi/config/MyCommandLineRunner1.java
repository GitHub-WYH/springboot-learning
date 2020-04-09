package com.ehi.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyCommandLineRunner1
 *
 * @Author: WangYiHai
 * @Date: 2020/4/9 18:13
 * @Description:
 *
 * Spring Boot 中针对系统启动任务提供了两种解决方案，分别是 CommandLineRunner 和 ApplicationRunner
 */
//将 MyCommandLineRunner1 注册为Spring容器中的一个 Bean
@Component
/**
 *表示这个启动任务的执行优先级，因为在一个项目中，启动任务可能有多个，所以需要有一个排序。
 * @Order 注解中，数字越小，优先级越大，默认情况下，优先级的值为 Integer.MAX_VALUE，表示优先级最低
 */
@Order(100)
public class MyCommandLineRunner1 implements CommandLineRunner {

    /**
     * 写启动任务的核心逻辑，当项目启动时，run方法会被自动执行
     * @param args  参数，来自于项目的启动参数，即项目入口类中，main方法的参数会被传到这里
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

    }
}