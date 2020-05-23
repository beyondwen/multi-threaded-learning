package com.wenhao.multithreadedlearning.v3;

public class V3_Interrupted implements Runnable {

    int index = 1;

    @Override
    public void run() {
        try {
            while (index <= 10) {
                System.out.println(Thread.interrupted()+"<1>");
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
