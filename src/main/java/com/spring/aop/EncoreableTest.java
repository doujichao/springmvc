package com.spring.aop;

import com.spring.aop.aspect.EncoreableConfig;
import com.spring.aop.perfromace.Performance;
import com.spring.aop.perfromace.PerformanceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {EncoreableConfig.class, PerformanceConfig.class})
public class EncoreableTest {
    @Autowired
    private Performance dance;

    @Test
    public void test(){
        dance.perform();
    }
}
