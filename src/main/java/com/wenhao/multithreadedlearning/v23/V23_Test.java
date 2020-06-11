package com.wenhao.multithreadedlearning.v23;

public class V23_Test {
    public static void main(String[] args) throws InterruptedException {


        //InheritableThreadLocal<Integer> threadLocal = new InheritableThreadLocal<>();
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        threadLocal.set(10);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Integer integer = threadLocal.get();
                if (integer == null){
                    integer = 0;
                }
                for (int i = 0; i < 10; i++) {
                    int i1 = integer + i;
                    threadLocal.set(i1);
                }
                System.out.println(threadLocal.get());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Integer integer = threadLocal.get();
                if (integer == null){
                    integer = 0;
                }
                for (int i = 0; i < 10; i++) {
                    int i1 = integer + i;
                    threadLocal.set(i1);
                }
                System.out.println(threadLocal.get());
            }
        });
        thread1.start();
        thread2.start();
        System.out.println(threadLocal.get());
        /*TimeUnit.SECONDS.sleep(10);
        Integer integer = threadLocal.get();
        System.out.println(integer);*/
        //threadLocal.remove();
    }
}
