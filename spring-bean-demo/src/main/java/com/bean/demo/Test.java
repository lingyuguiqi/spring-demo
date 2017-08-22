package com.bean.demo;

import com.bean.demo.Person;
import com.bean.demo.collectionDemo.RichPerson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("chinese");
        System.out.println(person.hashCode());
        person.Speak();
        person = (Person) context.getBean("american");
        person.Speak();
        person = (Person) context.getBean("rich");
        person.Speak();
        person = (Person) context.getBean("poor");
        person.Speak();
        person = (Person) context.getBean("normal");
        person.Speak();
        // 关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}