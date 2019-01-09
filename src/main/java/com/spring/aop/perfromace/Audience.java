package com.spring.aop.perfromace;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 表演的通知类，类似与日志，安全等等
 */
@Aspect
public class Audience {

    /**
     * 表演之前，手机静音，before注解定义了切入点，这个方法就是通知，组合到一起就是切面
     */
    @Before("execution(* com.spring.aop.perfromace.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("execution(* com.spring.aop.perfromace.Performance.perform(..))")
    public  void tackSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("execution(* com.spring.aop.perfromace.Performance.perform(..))")
    public  void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("execution(* com.spring.aop.perfromace.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
