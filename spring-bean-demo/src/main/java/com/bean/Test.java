package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=(Person)context.getBean("chinese");
        System.out.println(person.hashCode());
        person.Speak();
        person=(Person)context.getBean("american");
        person.Speak();
        Person person1=(Person)context.getBean("chinese");
        System.out.println(person1);
        Person person2=(Person)context.getBean("chinese");
        System.out.println(person2);
        // 关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}