package com.spring.autowired.demo;

import org.springframework.stereotype.Component;

/**
 * 棒冰
 */
@Component
public class Popsicle implements  Dessert {
    @Override
    public void eat() {
        System.out.println("Popsicle is delicious");
    }
}
