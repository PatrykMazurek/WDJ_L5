package com.wdj;

import java.util.Objects;

public class Osoba {

    final public int nr = 10;
    private Integer id;
    private String name;
    protected String lastName;

    public Osoba(){

    }

    public Osoba(int i, String name, String lastName){
        id = i;
        this.name = name;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(id, osoba.id) && Objects.equals(name, osoba.name) && Objects.equals(lastName, osoba.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName);
    }
}
