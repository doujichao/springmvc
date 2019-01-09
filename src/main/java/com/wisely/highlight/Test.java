package com.wisely.highlight;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        UserFunctionService contextBean = context.getBean(UserFunctionService.class);
        String hello = contextBean.SayHello("立法");
        System.out.println(hello);
        context.close();
    }
}
