package com.wisely.highlight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class DiConfig {

    @Bean
    public UserFunctionService userFunctionService(){
        return new UserFunctionService();
    }

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
}
