package com.wenhao.multithreadedlearning.v13review.holder;

public final class HolderSingleton {

    private HolderSingleton() {
    }

    private static class Holder {
        private static HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.instance;
    }

}
