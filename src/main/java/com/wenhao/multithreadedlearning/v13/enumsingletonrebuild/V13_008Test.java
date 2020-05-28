package com.wenhao.multithreadedlearning.v13.enumsingletonrebuild;

public class V13_008Test {

    public static void main(String[] args) {
        new Thread(() -> System.out.println(EnumSingletonRebuild.getInstance().hashCode())).start();
        new Thread(() -> System.out.println(EnumSingletonRebuild.getInstance().hashCode())).start();
    }
}
