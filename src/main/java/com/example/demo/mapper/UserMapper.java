package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
public interface UserMapper extends BaseMapper<User> {

//    @Select("SELECT * from user")
//    List<User> findAll();
//
//    @Insert("INSERT into user(username,password,sex,age,email,telephone,address,state) VALUES(#{username},#{password}," +
//            "#{sex},#{age},#{email},#{telephone},#{address},#{state});")
//    int insert(User user);
//
//    int update(User user);
//
//    @Delete("delete from user where id = #{id}")
//    Integer deleteById(@Param("id") Integer id);
//
//    //limit后不可用#{pageNum}#{pageSize}，用arg0及arg1
//    @Select("SELECT * from user where username like concat('%',#{arg2},'%') limit #{arg0}, #{arg1}")
//    List<User> selectPage(Integer pageNum, Integer pageSize, String username);
//
//    @Select("select count(*) from user where username like concat('%',#{arg2},'%')")
//    Integer selectTotal(String username);
}
