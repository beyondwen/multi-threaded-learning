package com.wenhao.multithreadedlearning.v13.volatiledoublecheck;

public final class VolatileDoubleCheck {

    private VolatileDoubleCheck() {

    }

    private static volatile VolatileDoubleCheck volatileDoubleCheck = null;


    public static VolatileDoubleCheck getVolatileDoubleCheck() {
        if (volatileDoubleCheck == null) {
            synchronized (VolatileDoubleCheck.class) {
                if (volatileDoubleCheck == null) {
                    volatileDoubleCheck = new VolatileDoubleCheck();
                }
            }
        }
        return volatileDoubleCheck;
    }
}
