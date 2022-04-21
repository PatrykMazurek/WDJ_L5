package com.wdj;

import java.util.Random;

public class Student extends Person implements Eat {

    private String uniwersityName;
    private int year;


    public Student(String un, int y){
        uniwersityName = un;
        year = y;
    }

    public String getUniwersityName() {
        return uniwersityName;
    }

    public void setUniwersityName(String uniwersityName) {
        this.uniwersityName = uniwersityName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String showInfo() {
        return " Nazwa uniwersytetu: " + uniwersityName;
    }

    @Override
    public Object convert(Object obj) {
        return null;
    }

    @Override
    public boolean goToLaunch() {
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
