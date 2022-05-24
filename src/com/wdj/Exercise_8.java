package com.wdj;

import com.wdj.classes.*;

import java.util.*;

public class Exercise_8 {

    public void point_a(List<Person> personList){
        // TODO rozwiązanie do zadania 7 a)
//        Employee t1 = new Employee("Jan", "Nowak", 3000.0, 0, LocalDateTime.now().minusYears(2));
        Student t1 = new Student("UP", 2);
        t1.setName("Jan");
        t1.lastName = "Nowak";
        if(!checkPerson(personList, t1)){
            personList.add(t1);
            System.out.println("Osoba zostałą dodana do listy");
        }else{
            System.out.println("Nie dodam osoby do listy, już istnieje w liście");
        }
    }

    public void point_b(List<Person> personList){
        // TODO rozwiązanie od zadania 7 b)
        // w rozwiązaniu podpunktu b) pomoże interfejs Comparer<Person>. Wykorzystując ten interfejs są dwie drogi:
        // 1. do każdej klasy dodać interfejs Comparer<Person> i nadpisaćmetodę compareTo().
        // 2. stworzyć dodatkową klasę PersonLastNameComparer, która implementuje interfejs Comparer<Person> i nadpisuje metodę
        //    compareTo() i wykorzytsać to w sposób przedstawiony poniżej.
        System.out.println("Dane przed posortowaniem");
        for (Person p : personList){
            System.out.println(p.toString());
        }

        // korzystając z klasy Collections wywołuje metodę sort i przekazuje do niej listę do posortowania oraz nowo utworzony
        // obiekt PersonLastNameComparer.
        Collections.sort(personList, new PersonLastNameComparer());

        System.out. println("Dane po posotrowaniu");
        for (Person p : personList){
            System.out.println(p.toString());
        }
    }

    public Map<String, List<Person>> point_c(List<Person> personList){
        // TODO rozwiązanie od zadania 7 c)
        // w zadaniu chodziło o pogrupowanie listy obiektów względem konkretnej klasy
        // dlatego funkcja zwraca mapę w której kluczem będzie nazwa klasy a wartościami listy obiektów danej klasy.

        Map<String, List<Person>> personMap = new HashMap<>();
        // w założeniach zadania jset pogrupowanie po nazwach klas.
        personMap.put("Student", new ArrayList<Person>());
        personMap.put("Employee", new ArrayList<Person>());
        personMap.put("Manager", new ArrayList<Person>());

        for (Person p : personList){
            // sprawdzenie jakiego typu jest obiekt i dodanie go do odpowidniej listy
            if (p instanceof Student){
                personMap.get("Student").add(p);
            }else if (p instanceof Manager){
                personMap.get("Manager").add(p);
            }else if (p instanceof Employee){
                personMap.get("Employee").add(p);
            }
        }
        System.out.println(personMap.get("Student").size());
        return personMap;
    }

    public void point_d(Map<String, List<Person>> personMap){
        // TODO rozwiązanie do zadania 7 d)

        // wersja porstrza
        System.out.println("Obiekty Student");
        for (String s : personMap.keySet()){
            System.out.println(s);
            for (Person p : personMap.get(s)){
                System.out.println(p.toString());
                System.out.println(p.getClass());
            }
        }
    }

    private boolean checkPerson(List<Person> personList, Person person){
        for (Person p : personList){
            if (p.getName().equals(person.getName()) &&
                    p.lastName.equals(person.lastName) &&
                    p.getClass().equals(person.getClass())){
                System.out.println("Podana osoba już istnieje");
                return true;
            }
        }
        return false;
    }
}
