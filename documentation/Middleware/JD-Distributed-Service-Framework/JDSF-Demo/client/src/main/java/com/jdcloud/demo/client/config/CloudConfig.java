package com.jdcloud.demo.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @program: jdsf_demo
 * @description: Configuration Center demo
 * @author: zhangjunfeng7
 * @create: 2018-12-24 09:51
 **/
@Component
@RefreshScope
@ConfigurationProperties(prefix = "config.prefix")
@Data
public class CloudConfig {

    private String name;

}
