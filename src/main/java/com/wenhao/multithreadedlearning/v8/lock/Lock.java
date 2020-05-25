package com.wenhao.multithreadedlearning.v8.lock;

import java.util.List;
import java.util.concurrent.TimeoutException;

public interface Lock {

    /**
     * 该方法 可以 永远被阻塞 并且可以 被中断
     *
     * @throws InterruptedException 中断异常
     */
    void lock() throws InterruptedException;

    /**
     * 该方法 可以被 中断 并且 加入了 超时的功能
     *
     * @param mills 超时时间
     * @throws InterruptedException 中断异常
     * @throws TimeoutException     超时异常
     */
    void lock(Long mills) throws InterruptedException, TimeoutException;

    /**
     * 释放锁功能
     */
    void unlock();

    /**
     * 获取 阻塞线程
     *
     * @return 阻塞线程
     */
    List<Thread> getBlockedThreads();
}
