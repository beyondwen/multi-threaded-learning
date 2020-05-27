package com.wenhao.multithreadedlearning.v13.lazy;

public final class LazyWay {

    private static LazyWay LAZY_WAY = null;

    private LazyWay() {

    }

    public static LazyWay getLazyWay() {
        if (null == LAZY_WAY) {
            LAZY_WAY = new LazyWay();
        }
        return LAZY_WAY;
    }
}
