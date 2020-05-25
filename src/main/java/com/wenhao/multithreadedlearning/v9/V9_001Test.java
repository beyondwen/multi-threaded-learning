package com.wenhao.multithreadedlearning.v9;

import java.util.concurrent.TimeUnit;

public class V9_001Test {

    public static void main(String[] args) throws InterruptedException {


        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
        Thread thread = new Thread(threadGroup, new Runnable() {
            int i = 0;

            @Override
            public void run() {
                while (true) {
                    i++;
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i == 10) {
                        int x = 1 / 0;
                    }


                }
            }
        }, "线程1");
        thread.setUncaughtExceptionHandler((t,e)->{
            System.out.println("抛出异常");
            e.printStackTrace();
        });
        thread.start();
        TimeUnit.SECONDS.sleep(2);
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        Thread[] threads = new Thread[mainGroup.activeCount()];
        int enumerate = mainGroup.enumerate(threads);
        System.out.println(enumerate);
        int enumerate1 = mainGroup.enumerate(threads, false);
        System.out.println(enumerate1);
    }
}
