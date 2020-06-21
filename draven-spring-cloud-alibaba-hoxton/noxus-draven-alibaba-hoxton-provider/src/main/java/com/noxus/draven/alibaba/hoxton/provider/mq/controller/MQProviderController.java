package com.noxus.draven.alibaba.hoxton.provider.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableBinding({Source.class})
@RestController
public class MQProviderController {


    @Autowired
    private Source source;


    @RequestMapping("mqSendRocketMQ")
    public String mqSendRocketMQ(String msg) {
        MessageBuilder<String> stringMessageBuilder = MessageBuilder.withPayload(msg);
        Message<String> build = stringMessageBuilder.build();
        source.output().send(build);
        return msg + "is successed";
    }
}

