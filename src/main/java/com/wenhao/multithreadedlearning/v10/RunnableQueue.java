package com.wenhao.multithreadedlearning.v10;

public interface RunnableQueue {

    /**
     * @param runnable 任务队列
     */
    void offer(Runnable runnable);

    /**
     * @return 获取队列中的任务
     */
    Runnable take() throws InterruptedException;

    /**
     *
     * @return 队列中任务大小
     */
    int size();


}
