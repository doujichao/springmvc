package com.spring.autowired.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 蛋糕
 */
@Component
@Qualifier("cold")
public class Cake implements  Dessert {
    @Override
    public void eat() {
        System.out.println("Cake is delicious");
    }
}








