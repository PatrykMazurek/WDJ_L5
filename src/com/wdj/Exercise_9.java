package com.wdj;

import com.wdj.classes.Person;
import com.wdj.classes.Task;

import java.util.List;

public class Exercise_9 {

    public void exercise(List<Person> personList){
        // dodanie nowego tasku do wybranego obiektu
        personList.get(0).tasks.add(new Task(1, "noew zadanie", "treść nowego zadania"));


    }
}
