package com.wdj;

import java.awt.geom.Arc2D;
import java.time.LocalDateTime;
import java.util.Random;

public class Employee extends Person implements GoToWork, Comparable<Employee> {

    private double zarobki;
    private int bonus;
    private LocalDateTime startPracy;

    public Employee() {
        super();
        zarobki = 3000;
        bonus = 0;
        startPracy = LocalDateTime.now();
    }

    public Employee(String n, String l, Double z, int b, LocalDateTime s){
        super(n, l);
        zarobki = z;
        bonus = b;
        startPracy = s;
    }

    @Override
    public String showInfo() {
        return "Pracownik zarabiający " + zarobki ;
    }

    @Override
    public Employee convert(Object obj) {
        if (obj instanceof Employee){
            return (Employee) obj;
        }else if(obj instanceof Student){
            return new Employee();
        }
        return null;
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
        return s;
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

    @Override
    public void goTo(String name) {

    }

    @Override
    public void goTo2(String name) {

    }


    @Override
    public String typeOfTransport() {
        return null;
    }

    @Override
    public boolean goToLaunch() {
        return false;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.getZarobki(), this.zarobki);
    }
}
