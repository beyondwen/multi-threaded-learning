package com.wenhao.multithreadedlearning.v3;

import java.util.concurrent.TimeUnit;

public class V3_Sleep implements Runnable{


    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.SECONDS.sleep(20);
                System.out.println("线程执行");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
