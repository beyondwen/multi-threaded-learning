package com.wenhao.multithreadedlearning.v15;

public interface TaskLifeCycle<T> {

    void onStart(Thread thread);

    void onRunning(Thread thread);

    void onFinshed(Thread thread, T t);

    void onError(Thread thread, Exception e);
}
