package com.xiaohu.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.xiaohu.service")
@Import(DemoConfiguration.class)
public class SpringIocConfiguration {
    public SpringIocConfiguration() {
        System.out.println("SpringConfiguration 容器初始化···");
    }
}
