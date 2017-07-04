package com.taylor;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiaolu.zhang
 * @desc:配置中心
 * @date: 2017/7/3 10:12
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigCenter {
    public static void main(String... args) {
        new SpringApplicationBuilder(ConfigCenter.class).web(true).run(args);
    }
}
