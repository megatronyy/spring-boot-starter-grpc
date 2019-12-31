package com.xbo.grpc.facade.service;


import com.xbo.grpc.annotation.GrpcService;
import com.xbo.grpc.constant.SerializeType;
import com.xbo.grpc.facade.entity.UserEntity;

import java.util.List;

@GrpcService(server = "user", serialization = SerializeType.PROTOSTUFF)
public interface UserServiceByProtoStuff {

    void insert(UserEntity userEntity);

    void deleteById(Long id);

    List<UserEntity> findAll();

}
