package com.yzx.xiaoxiong581.springcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xiaoxiong581
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain
{
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaMain.class, args);
    }
}
