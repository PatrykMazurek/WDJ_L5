package com.wdj.classes;

import java.util.Comparator;

public class Task implements Comparator<Task> {

    // stworzenie klasy Task do zadania 9

    private int id;
    private int status;
    private String title;
    private String text;

    public Task(int s, String ti, String te){
        status = s;
        title = ti;
        text = te;
    }

    public void showTask(){
        System.out.println("Status " + status + " tytuł zadania " + title + " treść zadania " + text );
    }

    // aby kolejka działał poprawnie wymagane jest nadpidanie metody compare() za pomocą  której będzie ustawiany
    // kolejnosć ważnosci zadań
    @Override
    public int compare(Task o1, Task o2) {
        return Integer.compare(o1.status, o2.status) ;
    }
}
