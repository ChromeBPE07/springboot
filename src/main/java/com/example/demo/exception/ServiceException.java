package com.example.demo.exception;

//自定义异常

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.Getter;

@Getter
public class ServiceException extends RuntimeException{
    private String code;

    public ServiceException(String code, String msg){
        super(msg);
        this.code = code;
    }

}
