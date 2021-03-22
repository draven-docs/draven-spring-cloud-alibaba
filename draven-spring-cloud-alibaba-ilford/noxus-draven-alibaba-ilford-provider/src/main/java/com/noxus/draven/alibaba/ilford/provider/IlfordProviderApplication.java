package com.noxus.draven.alibaba.ilford.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈功能概述〉<br>
 *
 * @className: IlfordProviderApplication
 * @package: com.noxus.draven.alibaba.ilford.provider
 * @author: draven
 * @date: 2021/1/1 18:20
 */


@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RefreshScope
@EnableFeignClients
//@MapperScan("com.noxus.draven.alibaba.hoxton.provider.mapper.seata")
public class IlfordProviderApplication {
    public static void main(String[] args) {

        SpringApplication.run(IlfordProviderApplication.class, args);
//        SpringApplication  app = new SpringApplication(ProviderApplication.class);
//        app.setBannerMode(Banner.Mode.LOG);
//        app.run(args);
    }
}
