package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: ljc
 * @Date: 2019/6/7 16:58
 * @Info:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_HystrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_HystrixDashboard.class,args);
    }
}
