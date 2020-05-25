package com.wenhao.multithreadedlearning.v9;

public class V9_000Test {

    public static void main(String[] args) {
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group1 = new ThreadGroup("新Group");
        System.out.println(group1.getParent() == currentGroup);
        ThreadGroup group2 = new ThreadGroup(group1,"group2");
        System.out.println(group2.getParent() == group1);
    }
}
