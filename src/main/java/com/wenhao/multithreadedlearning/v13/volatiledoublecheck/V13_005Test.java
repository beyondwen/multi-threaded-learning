package com.wenhao.multithreadedlearning.v13.volatiledoublecheck;

public class V13_005Test {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(VolatileDoubleCheck.getVolatileDoubleCheck().hashCode());
        }).start();
        new Thread(() -> {
            System.out.println(VolatileDoubleCheck.getVolatileDoubleCheck().hashCode());
        }).start();
    }
}
