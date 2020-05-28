package com.wenhao.multithreadedlearning.v13review.lazysafe;

public class V13Review_003Test {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(LazySafeSingleton.getInstance().hashCode());
        }).start();
        new Thread(() -> {
            System.out.println(LazySafeSingleton.getInstance().hashCode());
        }).start();
    }
}
