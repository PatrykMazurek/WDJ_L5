package com.wdj.interfaces;

public interface GoToWork extends Transport, Eat {

    // nie jest to wymagane
    public abstract void goTo(String name);

    void goTo2(String name);

    static final int DROGA = 100;

}
