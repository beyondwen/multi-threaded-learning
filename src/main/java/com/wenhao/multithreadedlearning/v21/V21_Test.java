package com.wenhao.multithreadedlearning.v21;

public class V21_Test {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            int i = 0;

            @Override
            public void run() {
                /*try {
                    TimeUnit.SECONDS.sleep(60);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().isInterrupted() + "当前线程状态");
                }*/
                while (i < 10) {
                    System.out.println(Thread.currentThread().isInterrupted() + "这是死循环");
                    i++;
                    Thread.yield();
                    /*try {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println(Thread.currentThread().isInterrupted() + "这是死循环");
                        i++;
                    } catch (InterruptedException e) {
                        System.out.println(Thread.currentThread().isInterrupted() + "当前线程状态");
                    }*/
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("中断之前");
                thread1.interrupt();
                System.out.println("中断之中");
                thread1.interrupted();
                System.out.println("中断之后");
                //thread1.interrupt();
                /*try {
                    System.out.println("中断之前");
                    //当thread1 未被阻塞时 只是修改标识符状态 为 true，当阻塞时便会抛出中断异常
                    thread1.interrupt();
                    //TimeUnit.SECONDS.sleep(5);
                    //thread1.interrupted();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        });
        thread1.start();
        thread2.start();
    }
}
