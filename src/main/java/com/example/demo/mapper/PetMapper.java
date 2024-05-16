package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Pet;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author rqe
 * @since 2024-05-08
 */
@Mapper
public interface PetMapper extends BaseMapper<Pet> {

}
