package com.wenhao.multithreadedlearning.v13.doublecheck;

public final class DoubleCheck {

    private static DoubleCheck doubleCheck = null;

    private DoubleCheck() {

    }

    public static DoubleCheck getDoubleCheck() {
        if (doubleCheck == null) {
            synchronized (DoubleCheck.class) {
                if (doubleCheck == null) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
