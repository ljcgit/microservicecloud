package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: ljc
 * @Date: 2019/6/8 16:33
 * @Info:
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringApp.class,args);
    }
}
