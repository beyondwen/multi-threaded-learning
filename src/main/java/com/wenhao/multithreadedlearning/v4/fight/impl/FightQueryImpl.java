package com.wenhao.multithreadedlearning.v4.fight.impl;

import com.wenhao.multithreadedlearning.v4.fight.FightQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class FightQueryImpl extends Thread implements FightQuery {

    private final String orgin;

    private final String dest;

    private final List<String> fightlist = new ArrayList<>();

    public FightQueryImpl(String airline, String orgin, String dest) {
        this.orgin = orgin;
        this.dest = dest;
    }

    @Override
    public void run() {
        System.out.printf(getName() + "-查询 from" + orgin + "to+" + dest);
        int i = ThreadLocalRandom.current().nextInt(10);
        try {
            TimeUnit.SECONDS.sleep(i);
            this.fightlist.add(getName() + "-" + i);
            System.out.println("航班" + getName() + "查询成功");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> get() {
        return this.fightlist;
    }
}
