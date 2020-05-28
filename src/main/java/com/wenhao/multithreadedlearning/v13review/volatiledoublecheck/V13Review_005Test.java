package com.wenhao.multithreadedlearning.v13review.volatiledoublecheck;

public class V13Review_005Test {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(VolatileDoubleCheckSingleton.getInstance().hashCode());
        }).start();
        new Thread(() -> {
            System.out.println(VolatileDoubleCheckSingleton.getInstance().hashCode());
        }).start();
    }
}
