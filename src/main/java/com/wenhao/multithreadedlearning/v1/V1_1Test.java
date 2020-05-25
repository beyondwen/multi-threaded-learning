package com.wenhao.multithreadedlearning.v1;

public class V1_1Test {

    public static void main(String[] args) {

        V1_1TempleDesign templeDesign = new V1_1TempleDesign() {
            @Override
            protected void run() {
                System.out.println("运行方法");
            }
        };
        templeDesign.start();

    }
}
