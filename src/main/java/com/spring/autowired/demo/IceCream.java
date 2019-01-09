package com.spring.autowired.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 冰淇凌
 */
@Component
@Primary
public class IceCream implements  Dessert {
    @Override
    public void eat() {
        System.out.println("IceCream is delicious");
    }
}
