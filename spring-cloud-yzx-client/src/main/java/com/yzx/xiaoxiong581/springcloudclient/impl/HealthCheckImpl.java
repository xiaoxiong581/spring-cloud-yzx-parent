package com.yzx.xiaoxiong581.springcloudclient.impl;

import com.yzx.xiaoxiong581.springcloudclient.third.server.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoxiong581
 */
@RestController
@RequestMapping("/")
public class HealthCheckImpl
{
    @Autowired
    public HealthCheckService healthCheckService;

    @RequestMapping("/healthcheck")
    @ResponseBody
    public String healthCheck(@RequestParam(value = "param", required = false) String param)
    {
        return healthCheckService.healthCheck(param);
    }
}
