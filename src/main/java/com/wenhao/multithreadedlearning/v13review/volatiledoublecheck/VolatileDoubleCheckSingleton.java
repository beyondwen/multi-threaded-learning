package com.wenhao.multithreadedlearning.v13review.volatiledoublecheck;

public final class VolatileDoubleCheckSingleton {

    private VolatileDoubleCheckSingleton() {
    }

    private static volatile VolatileDoubleCheckSingleton instance = null;

    public static synchronized VolatileDoubleCheckSingleton getInstance() {
        if (instance == null) {
            instance = new VolatileDoubleCheckSingleton();
        }
        return instance;
    }
}
