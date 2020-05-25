package com.wenhao.multithreadedlearning.v8.test;

import com.wenhao.multithreadedlearning.v8.lock.Lock;
import com.wenhao.multithreadedlearning.v8.lock.impl.BooleanLock;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.Thread.currentThread;
import static java.util.concurrent.ThreadLocalRandom.current;

public class V8_Test {

    private final Lock lock = new BooleanLock();

    public void syncMethod() {
        try {
            lock.lock();
            int randornint = current().nextInt(10);
            System.out.println(currentThread() + "get the lock. ");
            TimeUnit.SECONDS.sleep(randornint);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        V8_Test v8_test = new V8_Test();
        IntStream.range(0, 10).mapToObj(i -> new Thread(v8_test::syncMethod)).forEach(Thread::start);
    }
}
