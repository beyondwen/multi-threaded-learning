package com.wenhao.multithreadedlearning.v15;

import java.util.concurrent.TimeUnit;

public class V15_Test {

    public static void main(String[] args) {
        final TaskLifeCycle<String> lifeCycle = new EmptyLifeCycle<>();
        ObservableThread<String> observableThread = new ObservableThread<>(lifeCycle, () -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("finsh done");
            return "hello";
        });
        observableThread.start();
    }
}
