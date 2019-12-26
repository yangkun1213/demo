package com.yk.demo.service;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Application {





    private static Logger logger = Logger.getLogger(Application.class);

    /**
     * 主启动方法
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

        logger.info("======spring boot start success ===========");

    }


}
