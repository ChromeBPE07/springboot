package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.common.Constants;
import com.example.demo.common.Result;
import com.example.demo.controller.dto.UserDTO;
import freemarker.template.utility.StringUtil;
import org.apache.commons.lang.StringUtils;
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

//登录,@RequestBody注解：将前端json文件转为后端对象
@PostMapping("/login")
public Result login(@RequestBody UserDTO userDTO){
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)){
                return Result.error(Constants.CODE_400, "参数错误");
        }
        UserDTO dto = userService.login(userDTO);
        return Result.success(dto);
}

        //注册
        @PostMapping("/register")
        public Result register(@RequestBody UserDTO userDTO){
        String username = userDTO.getUsername();
        String password = userDTO.getPassword();
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)){
                return Result.error(Constants.CODE_400, "参数错误");
        }
        return Result.success(userService.register(userDTO));
        }

//新增和修改
@PostMapping
public boolean save(@RequestBody User user){
        return userService.saveOrUpdate(user);
        }

        //删除
    @DeleteMapping("/{id}")
public Boolean delete(@PathVariable Integer id){
        return userService.removeById(id);
        }

        //查询所有数据
    @GetMapping
public List<User> findAll(){
        return userService.list();
        }

        //根据id搜索结果
    @GetMapping("/{id}")
public User findOne(@PathVariable Integer id){
        return userService.getById(id);
        }

        //根据用户名查找并返回用户数据
        @GetMapping("/username/{username}")
        public Result findOne(@PathVariable String username){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
                return Result.success(userService.getOne(queryWrapper));
        }


//批量删除
@PostMapping("/del/batch")
public boolean deleteBatch(@RequestBody List<Integer> ids){
        return userService.removeBatchByIds(ids);
        };

//搜索
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
