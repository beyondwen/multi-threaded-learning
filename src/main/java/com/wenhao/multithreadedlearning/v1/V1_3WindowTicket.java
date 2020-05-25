package com.wenhao.multithreadedlearning.v1;

import com.wenhao.multithreadedlearning.v1.annotation.SafeThread;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

@SafeThread
public class V1_3WindowTicket implements Runnable {


    private int MAX_TICKET = 10000;

    private AtomicInteger index =new AtomicInteger(1);

    public V1_3WindowTicket() {
    }


    @Override
    public void run() {
        long l = System.currentTimeMillis();
        while (MAX_TICKET >= index.get()) {
            //index.getAndIncrement();
            try {
                sleep(10);
            } catch (Exception e) {
            }
            System.out.println("柜台名称：" + Thread.currentThread().getName() + " 当前号码：" + index.getAndIncrement());
        }
        long e = System.currentTimeMillis();
        System.out.println("当前线程耗时时间：" + Thread.currentThread().getName() + ":::" + (e - l));
    }
}
