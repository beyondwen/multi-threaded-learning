package com.wenhao.multithreadedlearning.v11.activeuser;

public class V11_FooSonActiveUse {

    static {
        System.out.println("父类静态变量");
    }

    public static int x = 0;

}

class V11_SonFooActiveUse extends V11_FooSonActiveUse {
    public static int y = 1;

    static {
        System.out.println("子类静态变量");
    }


}
