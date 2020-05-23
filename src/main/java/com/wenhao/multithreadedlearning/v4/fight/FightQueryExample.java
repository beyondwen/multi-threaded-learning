package com.wenhao.multithreadedlearning.v4.fight;

import com.wenhao.multithreadedlearning.v4.fight.impl.FightQueryImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FightQueryExample {

    private static List<String> fightCompany = Arrays.asList("CSA", "CEA", "HNA");

    public static void main(String[] args) {
        List<String> result = serach("BJ", "SH");
        result.forEach(System.out:: println);
    }

    public static List<String> serach(String orgin, String dest) {
        final List<String> result = new ArrayList<>();
        List<FightQueryImpl> tasks = fightCompany.stream().map(f -> createSearchTask(f, orgin, dest)).collect(toList());
        tasks.forEach(Thread::start);
        tasks.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        tasks.stream().map(FightQuery::get).forEach(result::addAll);
        return result;
    }

    private static FightQueryImpl createSearchTask(String f, String orgin, String dest) {
        return new FightQueryImpl(f, orgin, dest);
    }

}
