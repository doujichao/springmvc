package com.spring.aop.perfromace;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class PerformanceConfig {

    @Bean
    public Dance dance(){
        return new Dance();
    }
}

