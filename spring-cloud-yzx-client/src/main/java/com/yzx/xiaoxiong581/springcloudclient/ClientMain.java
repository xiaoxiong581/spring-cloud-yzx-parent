package com.yzx.xiaoxiong581.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author xiaoxiong581
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ClientMain
{
    public static void main(String[] args)
    {
        SpringApplication.run(ClientMain.class, args);
    }
}
