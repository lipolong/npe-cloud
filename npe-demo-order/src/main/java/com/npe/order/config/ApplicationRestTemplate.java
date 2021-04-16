package com.npe.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lp
 * @date 2021-04-15
 */
@Configuration
public class ApplicationRestTemplate {

    /**
     *   LoadBalanced增加轮询
     * @return 返回
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
