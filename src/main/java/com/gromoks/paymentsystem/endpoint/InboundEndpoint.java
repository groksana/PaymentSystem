package com.gromoks.paymentsystem.endpoint;

import com.gromoks.paymentsystem.model.Payment;
import com.gromoks.paymentsystem.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class InboundEndpoint {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    PaymentService paymentService;

    public Message<?> getById(Message<?> msg) {
        log.info("Start getById method");

        Payment payment = paymentService.getById(Long.valueOf(msg.getPayload().toString()));
        return MessageBuilder.withPayload(payment).copyHeadersIfAbsent(msg.getHeaders())
                .setHeader("http_statusCode", HttpStatus.OK).build();
    }

    public void post(Message<Payment> msg){
        log.info("Start create payment process");
        paymentService.create(msg.getPayload());
        log.info("Finish create payment process");
    }
}
