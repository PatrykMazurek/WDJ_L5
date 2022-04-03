package com.wdj;

public class Student extends Person {

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
        return super.showInfo() + " Nazwa uniwersytetu: " + uniwersityName;
    }
}
