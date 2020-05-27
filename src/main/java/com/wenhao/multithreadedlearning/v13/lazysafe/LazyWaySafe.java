package com.wenhao.multithreadedlearning.v13.lazysafe;

public final class LazyWaySafe {

    private LazyWaySafe() {

    }

    private static LazyWaySafe lazyWaySafe = null;

    public static synchronized LazyWaySafe getLazyWaySafe() {
        if (null == lazyWaySafe) {
            lazyWaySafe = new LazyWaySafe();
        }
        return lazyWaySafe;
    }
}
