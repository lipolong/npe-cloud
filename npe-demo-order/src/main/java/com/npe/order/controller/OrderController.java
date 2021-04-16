package com.npe.order.controller;

import com.netflix.discovery.EurekaClient;
import com.npe.common.api.CommResult;
import com.npe.order.entity.Payment;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author lp
 * @date 2021-04-15
 */
@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderController {

    private final RestTemplate restTemplate;
//    private static final String PAYMENT_URL="http://localhost:8081";
    /**
     * 集群
     */
    private static final String PAYMENT_URL="http://NPE-DEMO-PAYMENT";

    @GetMapping("/order/create")
    public CommResult create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create", payment, CommResult.class);
    }


    @GetMapping("/order/findById/{id}")
    public CommResult findById(@PathVariable Long id) {

        return restTemplate.getForObject(PAYMENT_URL+"/payment/findById/"+id,CommResult.class);
    }

}
