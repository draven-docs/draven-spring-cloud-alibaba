package com.noxus.draven.alibaba.hoxton.consumer.mq.rocketmq;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding({Sink.class})
public class CunsumerController {

    @StreamListener(Sink.INPUT)
    public void receiveRocketMq(String msg) {
        System.out.println("provider " + msg + "successed");
    }
}
