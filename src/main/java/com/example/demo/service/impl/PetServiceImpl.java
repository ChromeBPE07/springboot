package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.Constants;
import com.example.demo.controller.dto.UserDTO;
import com.example.demo.entity.Pet;
import com.example.demo.exception.ServiceException;
import com.example.demo.mapper.PetMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IPetService;
import com.example.demo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rqe
 * @since 2024-05-08
 */
@Service
public class PetServiceImpl extends ServiceImpl<PetMapper, Pet> implements IPetService {

//    private Pet getPetInfo(UserDTO userDTO){
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("username", userDTO.getUsername());
//        queryWrapper.eq("password", userDTO.getPassword());
//        User one = getOne(queryWrapper); //从数据库查询用户信息
//        return one;
//    }
}











