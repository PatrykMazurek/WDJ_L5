package com.wdj;

import java.time.LocalDateTime;
import java.util.Random;

public class Employee extends Person {

    private double zarobki;
    private int bonus;
    private LocalDateTime startPracy;

    public Employee(){
        super();
        zarobki = 0;
        bonus = 0;
        startPracy = LocalDateTime.now();
    }

    public Employee(String n, String l, Double z, int b, LocalDateTime s){
        super(n, l);
        zarobki = z;
        bonus = b;
        startPracy = s;
    }

    public void setZarobki(double zarobki) {
        this.zarobki = zarobki;
    }

    public double getZarobki() {
        return zarobki;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setStartPracy(LocalDateTime startPracy) {
        this.startPracy = startPracy;
    }

    public LocalDateTime getStartPracy() {
        return startPracy;
    }

    public String showInfo(String s, String... values) {
        for (String ts: values) {
            System.out.println(ts);
        }
        return super.showInfo() + s;
    }

    public final Boolean test(){
        Random rand = new Random();
        return rand.nextBoolean();
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "zarobki=" + zarobki +
                ", bonus=" + bonus +
                ", startPracy=" + startPracy +
                '}';
    }
}
