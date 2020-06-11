package com.wenhao.multithreadedlearning.v17.callback;

import java.util.concurrent.Callable;

/**
 * 异步返回回调 实现 Callable
 */
public class V17_ThreadCallBack implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "这是异步返回";
    }
}
