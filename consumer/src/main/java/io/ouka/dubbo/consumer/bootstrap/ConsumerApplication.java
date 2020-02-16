package io.ouka.dubbo.consumer.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description:
 * User: Ouka
 * Date: 2020-02-15
 * Time: 22:32
 *
 *   shu chu ri zhi zhong jiu mei you na ge qingqiu url  /test
 */
@SpringBootApplication
@ComponentScan("io.ouka.dubbo.consumer")
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
