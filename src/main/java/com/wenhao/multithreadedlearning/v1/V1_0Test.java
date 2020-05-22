package com.wenhao.multithreadedlearning.v1;

import java.util.concurrent.TimeUnit;

public class V1_0Test {

    public static void main(String[] args) {
        /*Thread thread1 = new Thread() {
            @Override
            public void run() {
                readNews();
            }
        };
        thread1.start();
        thread1.start();*/
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                //boilWater();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };
        thread2.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        thread2.start();
    }

    public static void readNews() {
        int i = 0;
        while (i == 10) {
            System.out.println("读新闻" + Thread.currentThread().getName());
            i++;
        }
    }

    public static void boilWater() {
        int i = 0;
        while (i == 10) {
            System.out.println("烧开水" + Thread.currentThread().getName());
            i++;
        }
    }
}
