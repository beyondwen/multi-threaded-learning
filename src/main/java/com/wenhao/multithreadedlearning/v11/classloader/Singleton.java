package com.wenhao.multithreadedlearning.v11.classloader;

public class Singleton {

    private static Singleton instance = new Singleton();


    private static int x =0;

    private static int y;


    public Singleton() {
        x++;
        y++;
    }

    public static Singleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.x);
        System.out.println(instance.y);
    }
}
