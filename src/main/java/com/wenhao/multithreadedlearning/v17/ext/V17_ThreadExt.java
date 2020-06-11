package com.wenhao.multithreadedlearning.v17.ext;

/**
 * 继承 方式
 */
public class V17_ThreadExt extends Thread{
    @Override
    public void run() {
        System.out.println("继承方式的进程");
    }
}
