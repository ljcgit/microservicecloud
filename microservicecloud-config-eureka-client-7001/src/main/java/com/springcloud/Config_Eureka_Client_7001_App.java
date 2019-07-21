package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: ljc
 * @Date: 2019/6/5 8:46
 * @Info:
 */
@EnableEurekaServer
@SpringBootApplication
public class Config_Eureka_Client_7001_App {

    public static void main(String[] args) {
        SpringApplication.run(Config_Eureka_Client_7001_App.class,args);
    }
}
