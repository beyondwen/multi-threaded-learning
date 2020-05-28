package com.wenhao.multithreadedlearning.v13review.hungry;

public class V13Review_001Test {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(HungrySingleton.getInstance().hashCode());
        }).start();
        new Thread(() -> {
            System.out.println(HungrySingleton.getInstance().hashCode());
        }).start();
    }
}
