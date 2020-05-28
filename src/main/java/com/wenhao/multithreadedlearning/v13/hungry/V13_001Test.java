package com.wenhao.multithreadedlearning.v13.hungry;

public class V13_001Test {

    public static void main(String[] args) {

        new Thread(()-> System.out.println(HungryWay.getHungryWay().hashCode())).start();
        new Thread(()-> System.out.println(HungryWay.getHungryWay().hashCode())).start();

    }
}
