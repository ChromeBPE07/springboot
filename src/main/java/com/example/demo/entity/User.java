package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
//@TableName(value = "user")  映射数据库对应的表名，mybatis查询表名时会在数据库直接查询方法名（User）的小写
public class User {
    @TableId(value = "id",type = IdType.AUTO) //标明主键
    private Integer id;
    private Integer state;
    private Integer age;
    private String username;
//    @JsonIgnore //不展示给前端，忽略字段
    private String password;
    private String sex;
    private String telephone;
    private String email;
    private String address;
    private String pic;

}
