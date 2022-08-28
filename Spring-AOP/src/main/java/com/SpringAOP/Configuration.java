package com.SpringAOP;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.SpringAOP")
@EnableAutoConfiguration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableCaching
public class Configuration {
}
