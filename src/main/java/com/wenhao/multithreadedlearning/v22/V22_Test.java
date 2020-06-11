package com.wenhao.multithreadedlearning.v22;

public class V22_Test {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("守护线程");
            }
        });

        thread.setDaemon(true);
        thread.start();
    }
}
