package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

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
  @ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户名")
      private String username;

      @ApiModelProperty("昵称")
      private String nickname;

      @ApiModelProperty("密码")
      private String password;

      @ApiModelProperty("性别")
      private String sex;

      @ApiModelProperty("年龄")
      private Integer age;

      @ApiModelProperty("电话")
      private String telephone;

      @ApiModelProperty("邮箱")
      private String email;

      @ApiModelProperty("地址")
      private String address;

      @ApiModelProperty("头像")
      private String avatarurl;

      @ApiModelProperty("有无领养宠物的经历 0 是没有 1 是由")
      private Integer state;

      private LocalDateTime createtime;
}
