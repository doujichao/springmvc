package com.spring.test;


import com.spring.aop.Encoreable;
import com.spring.demo.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    /**
     * 主函数，这里需要注意，aop是依赖于java的代理模式，所以getBean返回的是接口类，我们可以
     * 通过接口来接受这个参数，而不能使用具体的实现类，更加具体了面向接口编程的思想
     *
     * 而进行面向切面继承的时候，我们需要准备好接口和实现类，该类会动态生成代理类，以
     * 实现接口的类的实现方法来重写接口
     * @param args 初始化参数
     */
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        Encoreable dance = (Encoreable) context.getBean("performance");
        dance.performEncore();
    }
}
