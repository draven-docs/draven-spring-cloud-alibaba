package com.noxus.draven.alibaba.ilford.consumer.fegins;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author draven
 */
@Component
@FeignClient(value = "alibaba-provider", fallbackFactory = IlfordConsumerSentielFallbackFactory.class)
public interface IlfordConsumerService {
    /**
     * 调用服务提供者测试fegin调用
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/ilfordPro/getString", consumes = MediaType.TEXT_PLAIN_VALUE)
    String getString() throws Exception;

}
