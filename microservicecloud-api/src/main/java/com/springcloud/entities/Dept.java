package com.springcloud.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: ljc
 * @Date: 2019/6/3 17:06
 * @Info:
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@SuppressWarnings("serial")
@Data
@Accessors(chain=true)
public class Dept implements Serializable {
    private Long deptno;   //主键
    private String dname;     //部门名称
    private String dbSource;  //来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
