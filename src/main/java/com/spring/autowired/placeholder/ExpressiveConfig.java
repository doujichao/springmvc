package com.spring.autowired.placeholder;

import com.spring.demo.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ExpressiveConfig {
    @Autowired
    Environment env;

    public BlankDisc disc(){
        return new BlankDisc(env.getProperty("disc.title"),env.getProperty("disc.artist"));
    }
}
