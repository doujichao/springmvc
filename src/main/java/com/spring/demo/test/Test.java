package com.spring.demo.test;

import com.spring.demo.CDPlayer;
import com.spring.demo.CDPlayerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        context.close();

    }
}
