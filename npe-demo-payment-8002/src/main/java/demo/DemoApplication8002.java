package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lp
 * @date 2021-04-13
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DemoApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication8002.class,args);
        System.out.println("(♥◠‿◠)ﾉﾞ  项目启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
