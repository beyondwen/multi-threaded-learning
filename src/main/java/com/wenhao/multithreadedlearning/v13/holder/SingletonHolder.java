package com.wenhao.multithreadedlearning.v13.holder;

public final class SingletonHolder {

    public SingletonHolder() {
    }

    private static class Holder {
        private static SingletonHolder singletonHolder = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return Holder.singletonHolder;
    }
}
