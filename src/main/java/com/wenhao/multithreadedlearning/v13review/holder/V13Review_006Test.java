package com.wenhao.multithreadedlearning.v13review.holder;

public class V13Review_006Test {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(HolderSingleton.getInstance().hashCode());
        }).start();
        new Thread(() -> {
            System.out.println(HolderSingleton.getInstance().hashCode());
        }).start();
    }
}
