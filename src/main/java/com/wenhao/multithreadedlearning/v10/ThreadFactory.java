package com.wenhao.multithreadedlearning.v10;

@FunctionalInterface
public interface ThreadFactory {

    /**
     * 创建线程
     * @param runnable 线程
     * @return 线程
     */
    Thread createThread(Runnable runnable);
}
