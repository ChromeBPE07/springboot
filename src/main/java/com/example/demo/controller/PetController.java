package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.Constants;
import com.example.demo.common.Result;
import com.example.demo.controller.dto.UserDTO;
import com.example.demo.entity.Pet;
import com.example.demo.service.IPetService;
import com.example.demo.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rqe
 * @since 2024-05-17
 */
@RestController
@RequestMapping("/pet")
        public class PetController {
    
@Resource
private IPetService petService;

//新增和修改
@PostMapping
public boolean save(@RequestBody Pet pet){
        return petService.saveOrUpdate(pet);
        }

        //删除
    @DeleteMapping("/{id}")
public Boolean delete(@PathVariable Integer id){
        return petService.removeById(id);
        }

        //查询所有数据
    @GetMapping
public List<Pet> findAll(){
        return petService.list();
        }

        //根据id搜索结果
    @GetMapping("/{id}")
public Pet findOne(@PathVariable Integer id){
        return petService.getById(id);
        }

        //根据用户名查找并返回用户数据
        @GetMapping("/petname/{petname}")
        public Result findOne(@PathVariable String petname){
        QueryWrapper<Pet> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("petname", petname);
                return Result.success(petService.getOne(queryWrapper));
        }


//批量删除
@PostMapping("/del/batch")
public boolean deleteBatch(@RequestBody List<Integer> ids){
        return petService.removeBatchByIds(ids);
        };

//搜索
    @GetMapping("/page")
public Page<Pet> findPage(@RequestParam Integer pageNum,
                           @RequestParam Integer pageSize,
                           @RequestParam(defaultValue = "") String petname){
        IPage<Pet> page = new Page<>(pageNum, pageSize);
        QueryWrapper<Pet> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByDesc("id");  //倒序排序
        queryWrapper.like("petname", petname);
        return petService.page(new Page<>(pageNum,pageSize),queryWrapper);
        }


        }
