package com.yzx.xiaoxiong581.springcloudserver.impl;

import com.google.common.base.Joiner;
import org.apache.commons.lang.StringUtils;
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
    @RequestMapping("/healthcheck")
    @ResponseBody
    public String healthCheck(@RequestParam(value = "param", required = false) String param)
    {
        String result = "success";
        return StringUtils.isEmpty(param) ? result : Joiner.on(" ").join(result, param);
    }
}
