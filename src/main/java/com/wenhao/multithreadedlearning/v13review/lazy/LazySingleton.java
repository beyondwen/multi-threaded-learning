package com.wenhao.multithreadedlearning.v13review.lazy;

public final class LazySingleton {

    private LazySingleton() {
    }

    private static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
