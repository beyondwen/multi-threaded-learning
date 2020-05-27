package com.wenhao.multithreadedlearning.v12;

import java.util.concurrent.TimeUnit;

public class VolatileFoo {

    final static int MAX = 5;

    static volatile int init_value = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            int localValue = init_value;
            while (localValue < MAX) {
                //System.out.println(init_value + "初始值");
                //System.out.println(localValue + "本地值");
                if (init_value != localValue) {
                    System.out.println("数据被变更到 " + init_value);
                    localValue = init_value;
                }
                /*try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/

            }
        }, "渲染线程").start();

        new Thread(() -> {
            int localValue = init_value;
            while (localValue < MAX) {
                if (init_value != localValue) {
                    System.out.println("数据被更新到 " + localValue);
                    init_value = localValue++;
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (localValue == 0) {
                    localValue = 1;
                }
            }
        }, "更新线程").start();
    }
}
