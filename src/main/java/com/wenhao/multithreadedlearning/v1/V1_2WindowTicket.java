package com.wenhao.multithreadedlearning.v1;

import com.wenhao.multithreadedlearning.v1.annotation.NotSafeThread;

@NotSafeThread
public class V1_2WindowTicket extends Thread {

    private final String serviceName;

    private int MAX_TICKET = 10;

    private static int index = 1;

    public V1_2WindowTicket(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        while (MAX_TICKET >= index) {
            //index.getAndIncrement();
            try {
                sleep(10);
            } catch (Exception e) {
            }
            System.out.println("柜台名称：" + serviceName + " 当前号码：" + index++);
        }
        long e = System.currentTimeMillis();
        System.out.println("当前线程耗时时间：" + Thread.currentThread().getName() + ":::" + (e - l));
    }
}
