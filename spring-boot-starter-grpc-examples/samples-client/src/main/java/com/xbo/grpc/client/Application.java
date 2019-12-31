package com.xbo.grpc.client;

import com.xbo.grpc.annotation.GrpcServiceScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@GrpcServiceScan(packages = {"com.xbo.grpc.facade"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}