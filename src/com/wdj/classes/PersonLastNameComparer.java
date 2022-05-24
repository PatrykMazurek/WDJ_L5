package com.wdj.classes;

import java.util.Comparator;

public class PersonLastNameComparer implements Comparator<Person> {
    // stworzenie kalsy za  pomocą, której będe porównywał pola LastName z obiektów Person
    @Override
    public int compare(Person o1, Person o2) {
        return o1.lastName.compareTo(o2.lastName);
    }
}
