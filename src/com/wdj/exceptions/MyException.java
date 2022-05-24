package com.wdj.exceptions;

import java.io.IOException;

public class MyException extends Exception {

    public MyException(){
        System.err.println("mój wyjątek");
    }

    public MyException(String message){super(message);}

    public MyException(Throwable err){super(err);}

    public MyException(String message, Throwable err) {
        super(message, err);
    }
}
