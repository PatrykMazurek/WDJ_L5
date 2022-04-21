package com.wdj.classes;

import java.util.Objects;

public abstract class Person {

    final public int nr = 10;
    private static int nextId = 1;
    private Integer id;
    private String name;
    public String lastName;

    public Person(){
        id = getNestId();
        name = "";
        lastName = "";
    }

    public Person(String name, String lastName){
        id = getNestId() ;
        this.name = name;
        this.lastName = lastName;
    }

    private int getNestId(){
        return nextId++;
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

    public abstract String showInfo();

    public abstract Object convert(Object obj);

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
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName);
    }
}
