package com.wenhao.multithreadedlearning.v20;

import java.util.concurrent.TimeUnit;

public class V20_Test {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {

            boolean b = true;

            @Override
            public void run() {
                while (b) {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1");
                    //Thread.yield();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            boolean b = true;

            @Override
            public void run() {
                while (b) {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程2");
                    Thread.yield();
                }
            }
        });
        thread1.start();
        thread2.start();
        System.out.println("123");

    }
}
