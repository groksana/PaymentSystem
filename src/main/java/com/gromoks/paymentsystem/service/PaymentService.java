package com.gromoks.paymentsystem.service;

import com.gromoks.paymentsystem.model.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {
    Map<Long, Payment> paymentStorage = new HashMap<>();

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @PostConstruct
    public void init() {
        Payment firstPayment = new Payment(1, "firstPayment", 2000, "UAH");
        Payment secondPayment = new Payment(2, "secondPayment", 4000, "USD");

        paymentStorage.put(firstPayment.getId(), firstPayment);
        paymentStorage.put(secondPayment.getId(), secondPayment);
    }

    public void create(Payment payment) {
        log.info("Started to create payment: {}", payment);
        long startTime = System.currentTimeMillis();

        paymentStorage.put(payment.getId(), payment);

        log.info("Payment is created. It took {} ms", System.currentTimeMillis() - startTime);
    }

    public Payment getById(long id) {
        log.info("Get payment by id: {}", id);

        return paymentStorage.get(id);
    }
}
