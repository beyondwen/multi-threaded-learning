package com.wenhao.multithreadedlearning.v13review.doublecheck;

public class V13Review_004Test {

    public static void main(String[] args) {
        new Thread(() -> System.out.println(DoubleCheckSingleton.getInstance().hashCode())).start();
        new Thread(() -> System.out.println(DoubleCheckSingleton.getInstance().hashCode())).start();
    }
}
