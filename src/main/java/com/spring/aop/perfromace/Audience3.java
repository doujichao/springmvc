package com.spring.aop.perfromace;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 表演的通知类，类似与日志，安全等等
 */
@Aspect
public class Audience3 {

    @Pointcut("execution(* com.spring.aop.perfromace.Performance.perform(..))")
    public void performance(){

    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("Silencing cell phones");
            jp.proceed();
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }
}
