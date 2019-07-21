package com.rules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: ljc
 * @Date: 2019/6/6 9:26
 * @Info:
 */

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return  new RandomRule_LJC();
    }

}
