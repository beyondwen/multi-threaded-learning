package com.wenhao.multithreadedlearning.v10;

public interface ThreadPool {

    /**
     * 提交线程至线程池
     *
     * @param runnable 线程
     */
    void execute(Runnable runnable);

    /**
     * 关闭线程池
     */
    void shutdown();

    /**
     * 获取线程池初始化大小
     *
     * @return 初始化数量
     */
    int getInitSize();

    /**
     * 获取线程池 最大值
     *
     * @return 线程池最大值
     */
    int getMaxSize();

    /**
     * 获取 线程池中的核心线程数量
     *
     * @return 核心线程数量
     */
    int getCoreSize();

    /**
     * 获取 线程池中队列大小
     *
     * @return 线程池中队列大小
     */
    int getQueueSize();

    /**
     * 获取 活跃线程数量
     *
     * @return 活跃线程数量
     */
    int getActiveCount();

    /**
     * 线程池是否关闭
     *
     * @return 是否关闭
     */
    boolean isShutDown();
}
