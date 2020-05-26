package com.wenhao.multithreadedlearning.v10;

import java.util.concurrent.TimeUnit;

public class V10_Test {

    public static void main(String[] args) throws InterruptedException {
        final ThreadPool threadPool = new BasicThreadPool(2, 20, 4, 1000);
        for (int i = 0; i < 2; i++) {
            threadPool.execute(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + "：运行中");
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
       /* for (; ; ) {
            System.out.println("ActiveCount:" + threadPool.getActiveCount());
            System.out.println("QueueSize:" + threadPool.getQueueSize());
            System.out.println("CoreSize:" + threadPool.getCoreSize());
            System.out.println("MaxSize:" + threadPool.getMaxSize());
            System.out.println("================================");
            TimeUnit.SECONDS.sleep(10);
        }*/
        TimeUnit.SECONDS.sleep(10);
        threadPool.shutdown();
    }
}
