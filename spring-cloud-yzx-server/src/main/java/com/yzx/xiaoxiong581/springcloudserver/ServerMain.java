package com.yzx.xiaoxiong581.springcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiaoxiong581
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerMain
{
    public static void main(String[] args)
    {
        SpringApplication.run(ServerMain.class, args);
    }
}
