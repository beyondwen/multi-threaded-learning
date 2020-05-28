package com.wenhao.multithreadedlearning.v13.enumsingleton;

public class V13_007Test {

    public static void main(String[] args) {
        new Thread(() -> System.out.println(EnumSingleton.getInstance().hashCode())).start();
        new Thread(() -> System.out.println(EnumSingleton.getInstance().hashCode())).start();
    }
}
