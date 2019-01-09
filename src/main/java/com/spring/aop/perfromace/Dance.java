package com.spring.aop.perfromace;

import org.springframework.stereotype.Component;

/**
 * 跳舞
 */
@Component
public class Dance implements Performance {
    @Override
    public void perform() {
        System.out.println("Dancing is beautiful!!");
    }

}
