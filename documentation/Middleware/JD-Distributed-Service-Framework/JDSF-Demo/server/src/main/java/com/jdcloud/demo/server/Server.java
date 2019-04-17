package com.jdcloud.demo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: Server
 * @description: server Module Start Entry Class
 * @author: zhangjunfeng7
 * @create: 2018-09-19 21:26
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Server {


    public static void main(String args[]){
        SpringApplication.run(Server.class, args);
    }
}
