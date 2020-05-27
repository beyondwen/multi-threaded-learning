package com.wenhao.multithreadedlearning.v13.hungry;

public final class HungryWay {

    private static HungryWay hungryWay =new HungryWay();

    private HungryWay() {
    }

    public static HungryWay getHungryWay() {
        return hungryWay;
    }
}
