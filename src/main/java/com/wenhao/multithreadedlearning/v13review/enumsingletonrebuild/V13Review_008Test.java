package com.wenhao.multithreadedlearning.v13review.enumsingletonrebuild;

public class V13Review_008Test {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(EnumSingletonRebuild.getInstance().hashCode());
        }).start();
        new Thread(() -> {
            System.out.println(EnumSingletonRebuild.getInstance().hashCode());
        }).start();
    }
}
