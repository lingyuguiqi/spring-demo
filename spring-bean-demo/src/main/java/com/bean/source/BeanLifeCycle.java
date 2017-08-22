package com.bean.source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuolin
 * @version 创建时间：2017/8/22 17:35
 * classType:
 */
public class BeanLifeCycle {
    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("容器初始化成功");

        //得到Preson，并使用
        Company company = (Company) ctx.getBean("company");
        System.out.println(company);

        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext) ctx).registerShutdownHook();
    }
}
