package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import com.example.demo.service.IUserService;
import com.example.demo.entity.User;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rqe
 * @since 2024-05-08
 */
@RestController
@RequestMapping("/user")
        public class UserController {
    
@Resource
private IUserService userService;

//新增和修改
@PostMapping
public boolean save(@RequestBody User user){
        return userService.saveOrUpdate(user);
        }

    @DeleteMapping("/{id}")
public Boolean delete(@PathVariable Integer id){
        return userService.removeById(id);
        }

    @GetMapping
public List<User> findAll(){
        return userService.list();
        }

    @GetMapping("/{id}")
public User findOne(@PathVariable Integer id){
        return userService.getById(id);
        }

//批量删除
@PostMapping("/del/batch")
public boolean deleteBatch(@RequestBody List<Integer> ids){
        return userService.removeBatchByIds(ids);
        };

    @GetMapping("/page")
public Page<User> findPage(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize,
                           @RequestParam(defaultValue = "") String username){
        IPage<User> page = new Page<>(pageNum, pageSize);
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByDesc("id");  //倒序排序
        queryWrapper.like("username", username);
        return userService.page(new Page<>(pageNum,pageSize),queryWrapper);
        }


        }
