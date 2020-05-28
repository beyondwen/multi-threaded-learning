package com.wenhao.multithreadedlearning.v13.doublecheck;

public class V13_004Test {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(DoubleCheck.getDoubleCheck().hashCode());
        }).start();
        new Thread(() -> {
            System.out.println(DoubleCheck.getDoubleCheck().hashCode());
        }).start();
    }
}
