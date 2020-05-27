package com.wenhao.multithreadedlearning.v13.lazysafe;

public class V13_003Test {

    public static void main(String[] args) {
        new Thread(()->{
            LazyWaySafe lazyWaySafe = LazyWaySafe.getLazyWaySafe();
            System.out.println(lazyWaySafe.hashCode());
        }).start();
        new Thread(()->{
            LazyWaySafe lazyWaySafe = LazyWaySafe.getLazyWaySafe();
            System.out.println(lazyWaySafe.hashCode());
        }).start();
    }
}
