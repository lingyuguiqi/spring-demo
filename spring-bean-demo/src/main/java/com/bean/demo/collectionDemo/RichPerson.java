package com.bean.demo.collectionDemo;

import com.bean.demo.Person;

import java.util.List;

/**
 * @author zhuolin
 * @version 创建时间：2017/8/22 16:14
 * classType:
 */
public class RichPerson implements Person {

    List<String> cars;

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public void Speak() {
        System.out.println("I have " + cars);

    }
}
