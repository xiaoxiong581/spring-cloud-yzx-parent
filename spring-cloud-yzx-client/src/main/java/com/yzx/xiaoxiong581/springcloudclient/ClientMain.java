package com.yzx.xiaoxiong581.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author xiaoxiong581
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ClientMain
{
    public static void main(String[] args)
    {
        SpringApplication.run(ClientMain.class, args);
    }
}
