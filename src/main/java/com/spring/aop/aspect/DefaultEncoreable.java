package com.spring.aop.aspect;

import com.spring.aop.Encoreable;

public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("DefaultEncoreable,这里是Encoreable的实现类");
    }
}
