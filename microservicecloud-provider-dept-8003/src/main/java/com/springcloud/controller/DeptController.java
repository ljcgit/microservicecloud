package com.springcloud.controller;

import com.springcloud.entities.Dept;
import com.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: ljc
 * @Date: 2019/6/3 19:03
 * @Info:
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    @GetMapping(value="/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return service.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return service.list();
    }

    @GetMapping(value = "/dept/discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("************"+list);
        List<ServiceInstance> srvList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for(ServiceInstance element : srvList){
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }
        return this.discoveryClient;
    }

}
