package com.jdcloud.demo.server.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @program: TestConsul
 * @description:
 * @author: zhangjunfeng7
 * @create: 2018-11-29 18:51
 **/
@Service
public class ConfigService {

    @Value("${testKey}")
    private String testKey;


    public String getTestKey(){
        return testKey;
    }
}
