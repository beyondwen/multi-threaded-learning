package com.wenhao.multithreadedlearning.v13review.doublecheck;

public final class DoubleCheckSingleton {
    private DoubleCheckSingleton() {
    }

    private static DoubleCheckSingleton instance = null;

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
