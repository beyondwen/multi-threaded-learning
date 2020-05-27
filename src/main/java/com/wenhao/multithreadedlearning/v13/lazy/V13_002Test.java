package com.wenhao.multithreadedlearning.v13.lazy;

public class V13_002Test {

    public static void main(String[] args) {
        new Thread(() -> {
            LazyWay lazyWay = LazyWay.getLazyWay();
            System.out.println(lazyWay.hashCode());
        }).start();

        new Thread(() -> {
            LazyWay lazyWay = LazyWay.getLazyWay();
            System.out.println(lazyWay.hashCode());
        }).start();
    }
}
