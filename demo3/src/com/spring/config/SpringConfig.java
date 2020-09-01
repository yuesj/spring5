package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuesj
 * @date 2020/6/26
 */
//作为配置类，替代 xml 配置文件
@Configuration
@ComponentScan(basePackages = {"com.spring"})
public class SpringConfig {

}
