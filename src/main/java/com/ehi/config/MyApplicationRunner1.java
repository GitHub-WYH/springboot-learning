package com.ehi.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * ClassName: MyApplicationRunner1
 *
 * @Author: WangYiHai
 * @Date: 2020/4/9 18:16
 * @Description:
 *
 * ApplicationRunner 和 CommandLineRunner 功能一致，用法也基本一致，唯一的区别主要体现在对参数的处理上，
 * ApplicationRunner 可以接收更多类型的参数（ApplicationRunner 除了可以接收 CommandLineRunner 的参
 * 数之外，还可以接收 key/value形式的参数）。
 */
@Component
@Order(98)
public class MyApplicationRunner1 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //可以用来获取命令行中的无key参数
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("MyApplicationRunner1>>>" +nonOptionArgs);

        //可以用来获取所有key/value形式的参数的key
        Set<String> optionNames = args.getOptionNames();
        for (String optionName : optionNames) {
            System.out.println("MyApplicationRunner1>>>" +optionName);
        }

        //可以根据key获取key/value 形式的参数的value
        List<String> optionValues = args.getOptionValues("aa");

        //表示获取命令行中的所有参数
        String[] sourceArgs = args.getSourceArgs();
        System.out.println("MyApplicationRunner1>>>" + Arrays.toString(sourceArgs));
    }
}