package com.wenhao.multithreadedlearning.v13review.enumsingleton;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
