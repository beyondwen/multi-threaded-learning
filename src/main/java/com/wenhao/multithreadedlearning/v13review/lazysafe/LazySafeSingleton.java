package com.wenhao.multithreadedlearning.v13review.lazysafe;

public final class LazySafeSingleton {

    private LazySafeSingleton() {
    }

    private static LazySafeSingleton instance = null;

    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null){
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
