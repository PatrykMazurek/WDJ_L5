package com.wdj.exceptions;

public class MyRuntimeException extends RuntimeException{

    public MyRuntimeException(){}

    public MyRuntimeException(String message){
        super(message);
    }

    public MyRuntimeException(Throwable err){
        super(err);
    }

    public MyRuntimeException(String message, Throwable err){
        super(message, err);
    }
}
