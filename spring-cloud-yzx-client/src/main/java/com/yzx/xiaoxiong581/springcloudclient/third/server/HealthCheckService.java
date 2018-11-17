package com.yzx.xiaoxiong581.springcloudclient.third.server;

import com.yzx.xiaoxiong581.springcloudclient.third.constant.ApplicationName;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaoxiong581
 */
@FeignClient(value = ApplicationName.SPRING_CLOUD_SERVER)
@RequestMapping("/server")
public interface HealthCheckService
{
    @RequestMapping("/healthcheck")
    String healthCheck(@RequestParam(value = "param", required = false) String param);
}
