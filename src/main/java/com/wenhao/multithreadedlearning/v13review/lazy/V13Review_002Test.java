package com.wenhao.multithreadedlearning.v13review.lazy;

public class V13Review_002Test {

    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(LazySingleton.getInstance().hashCode());
        }).start();

        new Thread(()->{
            System.out.println(LazySingleton.getInstance().hashCode());
        }).start();
    }
}
