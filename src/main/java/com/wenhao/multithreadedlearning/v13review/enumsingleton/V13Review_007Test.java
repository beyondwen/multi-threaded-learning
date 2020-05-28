package com.wenhao.multithreadedlearning.v13review.enumsingleton;

public class V13Review_007Test {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(EnumSingleton.getInstance().hashCode());
        }).start();
        new Thread(() -> {
            System.out.println(EnumSingleton.getInstance().hashCode());
        }).start();
    }
}
