package com.spring.aop.one;


import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 表演的通知类，类似与日志，安全等等
 */
public class Audience1 {

    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("请手机静音！！");
            System.out.println("请就坐！！");
            jp.proceed();
            System.out.println("鼓掌，鼓掌，鼓掌!!");
        }catch (Throwable e){
            System.out.println("退钱");
        }
    }
}
