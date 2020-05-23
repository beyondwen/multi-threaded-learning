package com.wenhao.multithreadedlearning.v4;

public class V4_Test {

    public static void main(String[] args) {
        Runnable runnable = new V4_Join();
        Thread thread1 = new Thread(runnable, "join");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getState());
    }
}
