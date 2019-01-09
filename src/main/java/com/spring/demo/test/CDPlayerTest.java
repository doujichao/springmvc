package com.spring.demo.test;

import com.spring.demo.CDPlayerConfig;
import com.spring.demo.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;
    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(compactDisc);
        System.out.println(compactDisc);
    }
}
