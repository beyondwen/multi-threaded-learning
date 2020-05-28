package com.wenhao.multithreadedlearning.v15;

@FunctionalInterface
public interface Task<T> {
    T call();
}
