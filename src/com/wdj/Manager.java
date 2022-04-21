package com.wdj;

public class Manager extends Employee {

    private int bonus;

    public Manager(){
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getZarobki() {
        return super.getZarobki() * (double)(this.bonus/100) ;
    }

    @Override
    public String showInfo() {
        return "Szef zarabiający " + getZarobki() ;
    }
}
