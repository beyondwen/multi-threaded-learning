package com.wenhao.multithreadedlearning.v4;

import java.util.concurrent.TimeUnit;

public class V4_Join implements Runnable{
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("join");
    }
}
