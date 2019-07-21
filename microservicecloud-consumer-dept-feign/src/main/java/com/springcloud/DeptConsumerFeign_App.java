package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: ljc
 * @Date: 2019/6/3 19:40
 * @Info:
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class DeptConsumerFeign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_App.class,args);
    }
}
