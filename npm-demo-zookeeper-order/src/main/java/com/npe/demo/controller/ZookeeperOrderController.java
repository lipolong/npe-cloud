package com.npe.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lp
 * @date 2021-04-21
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ZookeeperOrderController {

    private final RestTemplate restTemplate;

    private static final String ZK_URL="http://npe-demo-payment-8004";


    @GetMapping("/zk/info")
    public String getZkUrlInfo(){
        return restTemplate.getForObject(ZK_URL + "/payment/zk", String.class);
    }


}
