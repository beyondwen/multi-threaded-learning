package com.wenhao.multithreadedlearning.v13.hungry;

public class V13_001Test {

    public static void main(String[] args) {
        HungryWay hungryWay = HungryWay.getHungryWay();
        HungryWay hungryWay1 = HungryWay.getHungryWay();
        System.out.println(hungryWay.hashCode());
        System.out.println(hungryWay1.hashCode());
    }
}
