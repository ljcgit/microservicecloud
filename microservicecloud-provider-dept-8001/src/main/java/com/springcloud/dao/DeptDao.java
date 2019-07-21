package com.springcloud.dao;

import com.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: ljc
 * @Date: 2019/6/3 18:45
 * @Info:
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
