package com.jdcloud.demo.client.controller;


import com.jdcloud.demo.client.feign.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: MyTest
 * @description:
 * @author: zhangjunfeng7
 * @create: 2018-09-19 21:46
 **/
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ServerService serverService;

    @RequestMapping("/{name}")
    public String getServer(@PathVariable String name){
        return serverService.getName(name);
    }
}
