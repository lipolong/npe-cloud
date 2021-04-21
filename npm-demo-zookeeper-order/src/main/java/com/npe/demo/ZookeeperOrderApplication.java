package com.npe.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lp
 * @date 2021-04-21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperOrderApplication.class,args);
        System.out.println("ZookeeperOrderApplication启动成功");
    }


}
