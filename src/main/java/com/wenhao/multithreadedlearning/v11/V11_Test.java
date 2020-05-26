package com.wenhao.multithreadedlearning.v11;

public class V11_Test {

    static {
        System.out.println("这是静态代码块");
    }

    public static int x = 10;

    public static void main(String[] args) {
        V11_NotInit v11_activeUse = new V11_NotInit();
        System.out.println(v11_activeUse);
        System.out.println(x);
    }
}
