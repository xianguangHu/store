package com.guang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huxianguang
 * @create 2018-03-13-下午8:54
 **/
@SpringBootApplication
@EnableEurekaClient
public class CloudAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminServiceApplication.class,args);
    }
}
