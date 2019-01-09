package com.spring.autowired.demo;

import org.springframework.stereotype.Component;

/**
 * 小饼干
 */
@Component
public class Cookies implements Dessert {
    @Override
    public void eat() {
        System.out.println("Cookies is delicious");
    }
}
