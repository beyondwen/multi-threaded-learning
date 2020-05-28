package com.wenhao.multithreadedlearning.v13.enumsingleton;

public enum EnumSingleton {

    INSTANCE;

    EnumSingleton() {
        System.out.println("初始化");
    }

    public static void method() {

    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
