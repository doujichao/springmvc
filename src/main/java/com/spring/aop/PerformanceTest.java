package com.spring.aop;

import com.spring.aop.perfromace.Performance;
import com.spring.aop.perfromace.PerformanceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PerformanceConfig.class)
public class PerformanceTest {

    @Autowired
    private Performance dance;

    @Test
    public void test(){
        System.out.println("dance = " + dance);
        dance.perform();
    }

}
