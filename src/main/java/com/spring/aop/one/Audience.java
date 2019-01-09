package com.spring.aop.one;


/**
 * 表演的通知类，类似与日志，安全等等
 */
public class Audience {

    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    public  void tackSeats(){
        System.out.println("Taking seats");
    }

    public  void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
