package com.wenhao.multithreadedlearning.v15;

public class EmptyLifeCycle<T> implements TaskLifeCycle<T> {

    public EmptyLifeCycle() {

    }

    public EmptyLifeCycle(T t) {

    }

    @Override
    public void onStart(Thread thread) {
        System.out.println("启动");
    }

    @Override
    public void onRunning(Thread thread) {
        System.out.println("运行");
    }

    @Override
    public void onFinshed(Thread thread, T t) {
        System.out.println("完成的结果为：" + t);
    }

    @Override
    public void onError(Thread thread, Exception e) {
        System.out.println("出现异常");
    }
}
