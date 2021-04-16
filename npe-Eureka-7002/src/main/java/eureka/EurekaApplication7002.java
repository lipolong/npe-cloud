package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lp
 * @date 2021-04-16
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7002.class,args);
        System.out.println("Eureka7002启动成功！！");
    }

}
