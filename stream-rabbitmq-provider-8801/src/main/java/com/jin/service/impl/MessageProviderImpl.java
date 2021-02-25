package com.jin.service.impl;

import com.jin.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author: Jin
 * @Date: 2021/02/25 23:59
 * @Description: MessageProviderImpl
 * @version: V1.0
 */
@EnableBinding(Source.class)
@Slf4j
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String uid = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uid).build());
        log.info("UUID===========" + uid);
        return null;
    }
}
