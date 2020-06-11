package com.wenhao.multithreadedlearning.v16;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Object object = "null";
        ThreadGroup test = new ThreadGroup("线程组1");
        Thread thread = new Thread(test, new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName());
                    /*try {
                        //object.wait();
                        //Thread.currentThread().join();
                        //wait();
                        //Thread.currentThread().join();
                        //TimeUnit.SECONDS.sleep(1);
                        System.out.println("123");
                    } catch (InterruptedException e) {
                        System.out.println(Thread.currentThread().getName() + Thread.currentThread().isInterrupted());
                    }*/
                }
            }
        });

        Thread thread1 = new Thread(test, new Runnable() {
            @Override
            public void run() {
                synchronized (object) {
                    //object.notify();

                }

            }
        });
        thread.start();
        thread1.start();

        //Thread.currentThread().interrupt();
        //System.out.println(Thread.currentThread().getState());
        System.out.println(thread.isInterrupted());
        System.out.println(thread.getThreadGroup().getParent()+"xxxxxzzzzzz");
        System.out.println(thread1.getThreadGroup());
        System.out.println(thread.getName() + thread.getState());
        System.out.println(thread1.getName() + thread.getState());
        System.out.println(Thread.currentThread().getName() + thread.getState());
        //thread.interrupt();
        //thread.notify();
        //thread.interrupt();
        //Thread.currentThread().notify();
        //thread.notifyAll();
        //thread.interrupt();
        System.out.println(thread.isInterrupted());
    }
}
