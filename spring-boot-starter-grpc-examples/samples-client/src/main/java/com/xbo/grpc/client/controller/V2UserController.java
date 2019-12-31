package com.xbo.grpc.client.controller;

import com.xbo.grpc.facade.entity.UserEntity;
import com.xbo.grpc.facade.service.UserServiceByProtoStuff;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v2/user")
public class V2UserController {

    private final UserServiceByProtoStuff userServiceByProtoStuff;

    @PostMapping("/add")
    public UserEntity insertUser(@RequestBody UserEntity userEntity){
        userServiceByProtoStuff.insert(userEntity);
        return userEntity;
    }

    @GetMapping("/list")
    public List<UserEntity> findAllUser(){
        return userServiceByProtoStuff.findAll();
    }

    @PostMapping("/remove")
    public String removeUser(@RequestParam("id") Long id){
        userServiceByProtoStuff.deleteById(id);
        return "success";
    }

}
