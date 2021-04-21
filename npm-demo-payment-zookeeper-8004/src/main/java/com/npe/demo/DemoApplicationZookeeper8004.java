package com.npe.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lp
 * @date 2021-04-13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoApplicationZookeeper8004 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplicationZookeeper8004.class,args);
        System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
