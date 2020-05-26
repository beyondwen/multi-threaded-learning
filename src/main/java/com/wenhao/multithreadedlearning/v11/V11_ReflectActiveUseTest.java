package com.wenhao.multithreadedlearning.v11;

public class V11_ReflectActiveUseTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class aClass = Class.forName("com.wenhao.multithreadedlearning.v11.V11_ReflectActiveUse");
        V11_ReflectActiveUse o = (V11_ReflectActiveUse) aClass.newInstance();
        System.out.println(o);
    }
}
