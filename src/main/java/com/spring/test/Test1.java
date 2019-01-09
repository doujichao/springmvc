package com.spring.test;


import com.spring.demo.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    /**
     * 主函数
     * @param args 初始化参数
     */
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application1.xml");
        CompactDisc dance = (CompactDisc) context.getBean("cd");
        dance.playTrack(3);
    }
}
