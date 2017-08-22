package com.bean.demo.collectionDemo;

import com.bean.demo.Person;

import java.util.Set;

/**
 * @author zhuolin
 * @version 创建时间：2017/8/22 17:24
 * classType:
 */
public class NormalPerson implements Person {

    Set<String> relations;

    public Set<String> getRelations() {
        return relations;
    }

    public void setRelations(Set<String> relations) {
        this.relations = relations;
    }

    public void Speak() {
        System.out.println(" I have " + relations + "亲戚");

    }
}
