package com.xbo.grpc.server.controller;

import com.xbo.grpc.facade.entity.UserEntity;
import com.xbo.grpc.facade.service.UserServiceBySofaHessian;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v0/user")
public class V0UserController {

    private final UserServiceBySofaHessian userServiceBySofaHessian;

    @PostMapping("/add")
    public UserEntity insertUser(@RequestBody UserEntity userEntity){
        userServiceBySofaHessian.insert(userEntity);
        return userEntity;
    }

    @GetMapping("/list")
    public List<UserEntity> findAllUser(){
        return userServiceBySofaHessian.findAll();
    }

    @PostMapping("/remove")
    public String removeUser(@RequestParam("id") Long id){
        userServiceBySofaHessian.deleteById(id);
        return "success";
    }

}
