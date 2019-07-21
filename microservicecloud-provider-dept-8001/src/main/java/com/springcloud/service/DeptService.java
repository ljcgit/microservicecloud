package com.springcloud.service;

import com.springcloud.entities.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ljc
 * @Date: 2019/6/3 18:59
 * @Info:
 */
public interface DeptService {

    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
