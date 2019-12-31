package com.xbo.grpc.facade.service;


import com.xbo.grpc.annotation.GrpcService;
import com.xbo.grpc.constant.SerializeType;
import com.xbo.grpc.facade.entity.UserEntity;

import java.util.List;

@GrpcService(server = "user", serialization = SerializeType.FASTJSON)
public interface UserServiceByFastJSON {

    void insert(String userEntityJson);

    void deleteById(String id);

    List<UserEntity> findAll();

}
