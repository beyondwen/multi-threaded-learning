package com.wenhao.multithreadedlearning.v1;

public class V1_3Test {

    public static void main(String[] args) {
        Runnable ticket = new V1_3WindowTicket();
        Thread one = new Thread(ticket, "一号服务窗");
        Thread two = new Thread(ticket, "二号服务窗");
        Thread three = new Thread(ticket, "三号服务窗");
        Thread four = new Thread(ticket, "四号服务窗");
        Thread five = new Thread(ticket, "五号服务窗");
        Thread six = new Thread(ticket, "六号服务窗");
        Thread seven = new Thread(ticket, "七号服务窗");
        Thread eight = new Thread(ticket, "八号服务窗");
        Thread nine = new Thread(ticket, "九号服务窗");
        Thread ten = new Thread(ticket, "十号服务窗");
        Thread eleven = new Thread(ticket, "十一号服务窗");
        Thread shier = new Thread(ticket, "十二号服务窗");
        Thread shisan = new Thread(ticket, "十三号服务窗");


        //long l = System.currentTimeMillis();
        one.start(); //105046
        two.start();
        three.start();
        four.start();
        five.start();
        six.start();
        seven.start();
        eight.start();
        nine.start();
        ten.start();
        eleven.start();
        shier.start();
        shisan.start();
        //long e = System.currentTimeMillis();
        //System.out.println(e-l);
    }
}
