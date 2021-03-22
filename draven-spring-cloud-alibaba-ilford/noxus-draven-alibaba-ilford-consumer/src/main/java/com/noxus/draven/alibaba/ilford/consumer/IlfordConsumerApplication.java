package com.noxus.draven.alibaba.ilford.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 〈功能概述〉<br>
 *
 * @className: IlfordConsumerApplication
 * @package: com.noxus.draven.alibaba.ilford.consumer
 * @author: draven
 * @date: 2021/1/1 17:47
 */
//(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication(excludeName = "org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration")
@RefreshScope
@EnableDiscoveryClient
@EnableFeignClients
public class IlfordConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(IlfordConsumerApplication.class, args);
    }
}
