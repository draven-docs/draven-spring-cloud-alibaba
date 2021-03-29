package com.noxus.draven.alibaba.ilford.consumer.fegins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 〈功能概述〉<br>
 *
 * @className: ProductCenterFeignApiWithSentielFallbackFactory
 * @package: com.noxus.draven.alibaba.ilford.consumer.fegins
 * @author: draven
 * @date: 2021/3/28 22:32
 */
@Component
@Slf4j
public class IlfordConsumerSentielFallbackFactory implements FallbackFactory<IlfordConsumerService> {
    @Override
    public IlfordConsumerService create(Throwable cause) {
        return new IlfordConsumerService() {
            @Override
            public String getString() {
                log.info(cause.getMessage());
                /*if (cause instanceof FlowException) {
                    log.info("我来了呀 "+cause.getMessage());
                }*/
                return "SentielFallbackFactory "+cause.getMessage();
            }
        };
    }
}
