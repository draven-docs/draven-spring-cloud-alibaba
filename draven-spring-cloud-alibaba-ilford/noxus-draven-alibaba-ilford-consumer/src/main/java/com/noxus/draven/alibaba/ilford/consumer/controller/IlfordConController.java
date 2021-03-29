package com.noxus.draven.alibaba.ilford.consumer.controller;

import com.noxus.draven.alibaba.ilford.consumer.fegins.IlfordConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
@RequestMapping("/ilfordCon")
public class IlfordConController {
    /*@GetMapping("/getString")
    public Mono<String> getString() {
        return Mono.just("consumer");
    }*/

    /*@Value("${redis.wawa}")
    private String rediswahaha;*/

    @Value("${mysql.url}")
    private String url;

    @Autowired
    private IlfordConsumerService consumerService;

    // @GlobalTransactional
    @GetMapping(value = "/fegin/consumer")
    //@SentinelResource("/fegin/consumer")
    public String echo() throws Exception {
        System.out.println("开始fegin调用");
        return consumerService.getString();
    }

    /*
    @SentinelResource(value = "sayHello")
    @GetMapping(value = "/consumer")
    public String echotest() {
        return rediswahaha;
    }*/

  /* @SentinelResource(value = "echotestornot")
   @GetMapping(value = "/echotestornot")
   public String echotestornot() {
        return rediswahaha + " " + url;
   }*/
}
