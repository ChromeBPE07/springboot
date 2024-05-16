package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author rqe
 * @since 2024-05-08
 */
@Getter
@Setter
  @ApiModel(value = "Pet对象", description = "")
public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("宠物名")
      private String petname;

      @ApiModelProperty("性别")
      private String sex;

      @ApiModelProperty("年龄")
      private Integer age;

      @ApiModelProperty("品种")
      private String pettype;

      @ApiModelProperty("简介")
      private String remark;

      @ApiModelProperty("图片")
      private String pic;

      @ApiModelProperty("领养状态 0 没有申请领养 1 被申请领养 2 已经被领养")
      private Integer state;

}
