package com.noxus.draven.alibaba.ilford.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author draven
 */
@RestController
@RefreshScope
@RequestMapping("/ilfordPro")
@Slf4j
public class IlfordProviderController {


    @Value("${mysql.url}")
    private String url;

    /**
     * @SentinelResource(value = "resourceName",
     * blockHandlerClass = MyBlockHandler.class,
     * // 这里blockHandler方法必须为静态方法
     * blockHandler = "blockHandler",
     * fallback = "fallback")
     */
    @GetMapping(value = "/getString")
    public String getString() throws Exception {
        log.info("我是服务提供者");
        return "我是服务提供者 " + url;
    }

    /**
     * 此配置不生效-待解决 TODO
     */
   /*public String fallback(String name, Throwable e) {
        log.info("进入sentinelResource注解测试,进入fallback，参数name={},b={}", name, e.toString());
        return "fallback";
    }*/

    /**
     * 此配置不生效-待解决 TODO
     */
    // Block 异常处理函数，参数最后多一个 BlockException，其余与原函数一致.
    /*
        public String blockHandler(String name, BlockException ex) {
        // Do some log here.
        ex.printStackTrace();
        return "Oops, error occurred at " + name;
    }*/
}
