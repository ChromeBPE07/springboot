package com.example.demo.controller.dto;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import lombok.Data;

//接收前端登录请求的参数
@Data
public class UserDTO {
    private String username;
    private String password;
    private String nickname;
    private String avatarurl;
    private String role;
}
