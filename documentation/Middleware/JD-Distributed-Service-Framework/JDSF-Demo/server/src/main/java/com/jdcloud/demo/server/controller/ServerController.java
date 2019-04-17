package com.jdcloud.demo.server.controller;

import com.jdcloud.demo.server.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @program: MyTest
 * @description:
 * @author: zhangjunfeng7
 * @create: 2018-09-19 21:27
 **/
@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private BusinessService businessService;


    @RequestMapping("/{name}")
    public String getName(@PathVariable String name){

        return name + "<------server------>" + businessService.getBusinessRandom();
    }

}
