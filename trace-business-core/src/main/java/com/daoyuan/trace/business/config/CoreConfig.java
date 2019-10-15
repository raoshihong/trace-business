package com.daoyuan.trace.business.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath*:dubbo/dubbo-provider.xml")
@MapperScan(basePackages = {"com.daoyuan.trace.business.mapper"})
@ComponentScan(basePackages = {"com.daoyuan.trace.client"})
public class CoreConfig {
}
