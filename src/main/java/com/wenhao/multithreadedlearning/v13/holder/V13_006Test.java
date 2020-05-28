package com.wenhao.multithreadedlearning.v13.holder;

public class V13_006Test {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(SingletonHolder.getInstance().hashCode());
        }).start();
        new Thread(() -> {
            System.out.println(SingletonHolder.getInstance().hashCode());
        }).start();
    }
}
