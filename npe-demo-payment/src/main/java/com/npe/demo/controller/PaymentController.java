package com.npe.demo.controller;

import com.npe.common.api.CommResult;
import com.npe.demo.entity.Payment;
import com.npe.demo.service.IPaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/**
 * @author lp
 * @date 2021-04-15
 */
@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PaymentController {

    private final IPaymentService iPaymentService;
    @Value("${server.port}")
    private String port;
    /**
     * 服务发现客户端
     */
    private final DiscoveryClient discoveryClient;

    @GetMapping("/payment/discovery")
    public Object discovery() {
        //获取所有微服务名称
        List<String> services = discoveryClient.getServices();
        for (String s:services)System.out.println(s);
        //获取微服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("xxx");
        for (ServiceInstance instance:instances){
            String host = instance.getHost();
            URI uri = instance.getUri();
        }
        return null;
    }


    @PostMapping("/payment/create")
    public CommResult create(@RequestBody Payment payment) {
        if (StringUtils.isEmpty(payment.getSerial())) {
            return new CommResult(HttpStatus.NOT_FOUND.value(), "失败:" + port);
        }
        int result = iPaymentService.create(payment);
        if (result > 0) {
            return new CommResult(HttpStatus.OK.value(), "成功:" + port);
        }
        return new CommResult(HttpStatus.NOT_FOUND.value(), "失败:" + port);
    }

    @GetMapping("/payment/findById/{id}")
    public CommResult findById(@PathVariable Long id) {
        Payment payment = iPaymentService.findById(id);
        if (payment != null) {
            return new CommResult(HttpStatus.OK.value(), "查询成功:" + port, payment);
        }
        return new CommResult(HttpStatus.NOT_FOUND.value(), "没有对应记录:" + port);
    }


}
