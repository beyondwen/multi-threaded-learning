package com.wenhao.multithreadedlearning.v10;

public class RunnableDenyException extends RuntimeException{

    public RunnableDenyException(String message) {
        super(message);
    }
}
