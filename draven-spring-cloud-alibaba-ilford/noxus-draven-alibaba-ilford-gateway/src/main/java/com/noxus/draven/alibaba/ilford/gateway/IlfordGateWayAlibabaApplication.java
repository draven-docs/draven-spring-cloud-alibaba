package com.noxus.draven.alibaba.ilford.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RefreshScope
public class IlfordGateWayAlibabaApplication {

    public static void main(String[] args) {

        System.setProperty("csp.sentinel.app.type", "1");
        SpringApplication.run(IlfordGateWayAlibabaApplication.class, args);
    }


    @RequestMapping("/testGateWay")
    public String testConfig() {

        return "testGateWay";
    }
}
