package com.wdj.classes;

import com.wdj.interfaces.Eat;

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

    public class HelpStudent {

        private int number;

        public HelpStudent(){
            System.out.println();
        }

        public void getHelpInfo(String subject){
            System.out.println("Student " + getName() + " potrzebuje pomocy z " +
                    "" + subject );
        }

        public int getHelpMony(){
            switch (year){
                case 1:
                    return 1000;
                case 2:
                    return 1100;
                case 3:
                    return 1350;
                case 4:
                    return 1500;
                default:
                    return 0;
            }
        }

        // tak głęboko nie jset wymagane

//        public class HelpStudent2{
//
//        }
    }
}
