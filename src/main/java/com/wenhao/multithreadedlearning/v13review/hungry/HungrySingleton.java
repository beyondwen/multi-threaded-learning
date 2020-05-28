package com.wenhao.multithreadedlearning.v13review.hungry;

public final class HungrySingleton {

    private HungrySingleton() {
    }

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
