package com.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ljc
 * @Date: 2019/6/3 19:24
 * @Info:
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  //开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
//        //采用随机算法替换轮询算法
//        return new RandomRule();
//    }

}
