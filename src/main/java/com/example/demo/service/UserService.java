package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    public boolean saveUser(User user) {
//        if(user.getId() == null){
//            return save(user);
//        }else{
//            return updateById(user);
//        }

        return saveOrUpdate(user);
    }

//    @Autowired
//    private UserMapper userMapper;

//    public int save(User user){
//        if(user.getId() == null){ //user没有id就是新增
//            return userMapper.insert(user);
//        }else { //否则就修改
//            return userMapper.update(user);
//
//        }
//    }

}
