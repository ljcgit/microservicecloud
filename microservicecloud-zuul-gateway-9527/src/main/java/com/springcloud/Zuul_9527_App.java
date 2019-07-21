package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.util.Arrays;

/**
 * @Author: ljc
 * @Date: 2019/6/7 23:31
 * @Info:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableZuulProxy
public class Zuul_9527_App {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_App.class,args);
    }


}
