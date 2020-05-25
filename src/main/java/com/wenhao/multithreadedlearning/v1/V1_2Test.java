package com.wenhao.multithreadedlearning.v1;

public class V1_2Test {

    public static void main(String[] args) {
        V1_2WindowTicket one = new V1_2WindowTicket("一号服务窗");
        V1_2WindowTicket two = new V1_2WindowTicket("二号服务窗");
        V1_2WindowTicket three = new V1_2WindowTicket("三号服务窗");
        V1_2WindowTicket four = new V1_2WindowTicket("四号服务窗");
        //long l = System.currentTimeMillis();
        one.start();
        two.start();
        three.start();
        four.start();
        //long e = System.currentTimeMillis();
        //System.out.println(e-l);
    }
}
