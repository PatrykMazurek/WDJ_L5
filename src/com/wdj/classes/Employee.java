package com.wdj.classes;

import com.wdj.interfaces.GoToWork;
import com.wdj.interfaces.Help;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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

//    @Override
//    public String toString() {
//        return "Pracownik{" +
//                "zarobki=" + zarobki +
//                ", bonus=" + bonus +
//                ", startPracy=" + startPracy +
//                '}';
//    }

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

    public class HelpEmployee implements Help{

        @Override
        public void getHelpInfo(String topic) {
            // zgłoszenie potrzeby pomocy dla pracownika

            System.out.println("Pracownik " + getName() + " potrzebuje pomocy w " + topic);
        }

        @Override
        public double getHelpMony() {
            // porównanie daty i obliczenie ile miesięcy mineło między obydwami datatami
            Long monthBettwen = ChronoUnit.MONTHS.between(startPracy, LocalDateTime.now());
            if (monthBettwen < 18){
                System.out.println("Pomoc w wysokości 10% podstawowje wypłaty");
                return zarobki * 0.1;
            } else if (monthBettwen > 19 && monthBettwen < 30){
                System.out.println("Pomoc w wysokości 30% podstawowje wypłaty");
                return zarobki * 0.3;
            } else{
                System.out.println("Pomoc w wysokości 50% podstawowje wypłaty");
                return zarobki * 0.5;
            }
        }
    }
}
