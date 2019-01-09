package com.spring.autowired;

import com.spring.autowired.demo.Dessert;
import com.spring.autowired.demo.DessertConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {
    private Dessert dessert;
    @Autowired
    @Qualifier("cold")
    public void setDessert(Dessert dessert){
        this.dessert=dessert;
    }

    @Test
    public void test(){
        dessert.eat();
    }
}
