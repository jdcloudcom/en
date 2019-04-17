package com.jdcloud.demo.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: Client
 * @description: Method of Calling the Server
 * @author: zhangjunfeng7
 * @create: 2018-09-20 10:55
 **/
@Service
@FeignClient("jdsf-server")
public interface ServerService {

    @RequestMapping("/server/{name}")
    String getName(@PathVariable("name") String name);
}
