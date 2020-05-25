package com.wenhao.multithreadedlearning.v6;

import java.util.LinkedList;


public class EventQueue {

    private final int max;

    static class Event {

    }

    private final LinkedList<Event> events = new LinkedList<>();

    private static final int DEFAUTL_MAX_EVENT = 10;

    public EventQueue() {
        this(DEFAUTL_MAX_EVENT);
    }

    public EventQueue(int max) {
        this.max = max;
    }

    public void offer(Event event) {
        synchronized (events) {
            while (events.size() >= max) {
                try {
                    System.out.println("当前线程为"+Thread.currentThread().getName()+ "队列已满");
                    events.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("当前线程为"+Thread.currentThread().getName()+"新的队列已经提交");
            System.out.println("当前线程为"+Thread.currentThread().getName()+"状态为："+Thread.currentThread().getState());
            events.addLast(event);
            events.notifyAll();
        }
    }

    public Event take() {
        synchronized (events) {
            System.out.println("队列容量："+events.size());
            while (events.isEmpty()) {
                try {
                    System.out.println("当前线程为"+Thread.currentThread().getName()+"队列为空");
                    events.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Event event = events.removeFirst();
            this.events.notifyAll();
            System.out.println("当前线程为"+Thread.currentThread().getName()+"正在处理中");
            return event;
        }
    }
}
