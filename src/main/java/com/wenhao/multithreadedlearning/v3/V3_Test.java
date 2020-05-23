package com.wenhao.multithreadedlearning.v3;

public class V3_Test {

    /*public static void main(String[] args) {
        Runnable runnable = new V3_Sleep();
        Thread thread = new Thread(runnable,"sleep");
        thread.start();
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println(thread.getState());
    }*/

    public static void main(String[] args) {
        Runnable runnable = new V3_Interrupted();
        Thread thread = new Thread(runnable, "interrupted");
        thread.start();
        //thread.interrupt();
        System.out.println(thread.isInterrupted() + "<2>");
        //thread.interrupt();
        System.out.println(thread.isInterrupted() + "<3>");
        System.out.println(thread.getState());
    }
}
