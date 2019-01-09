package com.spring.aop.aspect;


import com.spring.aop.Encoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * 组合切面类
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "com.spring.aop.perfromace.Performance+"
        ,defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
