package com.springcloud.controller;

import com.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: ljc
 * @Date: 2019/6/3 19:28
 * @Info:
 */
@RestController
public class DeptController_Consumer {

    //private static final String PREFIX = "http://localhost:8001";
    private static final String PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(PREFIX+"/dept/add",dept,Boolean.class);
    }

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Integer id){
        return restTemplate.getForObject(PREFIX+"/dept/get/"+id,Dept.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(PREFIX+"/dept/list",List.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(PREFIX+"/dept/discovery",Object.class);
    }
}
