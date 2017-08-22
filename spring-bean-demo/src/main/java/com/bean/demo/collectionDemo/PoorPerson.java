package com.bean.demo.collectionDemo;

import com.bean.demo.Person;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author zhuolin
 * @version 创建时间：2017/8/22 17:16
 * classType:
 */
public class PoorPerson implements Person {

    Map<String, BigDecimal> debt;

    public Map<String, BigDecimal> getDebt() {
        return debt;
    }

    public void setDebt(Map<String, BigDecimal> debt) {
        this.debt = debt;
    }

    public void Speak() {
        System.out.print("I owm ");
        for (String name : debt.keySet()) {
            System.out.print(name + debt.get(name) + "元");
        }
        System.out.println();
    }
}
