package com.npe.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lp
 * @date 2021-04-15
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PaymentController {


    @Value("${server.port}")
    private String port;
    private final DiscoveryClient discoveryClient;

    @GetMapping("/payment/zk")
    public String paymentZk() {
        return "端口号：" + port;
    }


}
