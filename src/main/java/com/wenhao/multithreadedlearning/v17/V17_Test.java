package com.wenhao.multithreadedlearning.v17;

import com.wenhao.multithreadedlearning.v17.callback.V17_ThreadCallBack;
import com.wenhao.multithreadedlearning.v17.ext.V17_ThreadExt;
import com.wenhao.multithreadedlearning.v17.impl.V17_ThreadImp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class V17_Test {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new V17_ThreadExt());
        Thread thread2 = new Thread(new V17_ThreadImp());
        thread1.start();
        thread2.start();
        FutureTask<String> futureTask = new FutureTask<>(new V17_ThreadCallBack());
        Thread thread3 = new Thread(futureTask);
        thread3.start();
        try {
            String s = futureTask.get();
            System.out.println(s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
