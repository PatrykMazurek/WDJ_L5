package com.wdj;

import com.wdj.classes.Person;
import com.wdj.exceptions.MyException;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HelpMethods {

    public void readFromFile(){
        try {
            FileReader fr = new FileReader(new File("Osoba.txt"));
            String line = "";
            BufferedReader beff = new BufferedReader(fr);
            while((line = beff.readLine() ) != null){
                System.out.println(line);
            }
            beff.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(Person o) throws IOException{
        File file = new File("Osoba.txt");
        FileWriter fw;
        fw = new FileWriter(file);
        fw.write(o.toString() + "\n");
        fw.flush();
        fw.close();
    }

    public void arrayDecription(){
        System.out.println(" --- Listy --- ");
        // deklaracja listy
        List<String> strings = new LinkedList<>();
        // Dodanie elemntu do listy
        strings.add("Pomidor");
        strings.add("Pomarańcza");
        strings.add("Kiwi");
        strings.add("Pomidor");
        strings.add("Truskawka");
        // Stprawdzenie długości listy
        System.out.println(strings.size());
        // wypisanie wszystkich elementów lity
        for (String s : strings){
            System.out.println(s);
        }
        // wstawienie elementu w konkretne miejsce
        strings.set(2, "Kalafior");
        // sprawdzenie czy lista nie jset pusta
        if (strings.isEmpty()){
            System.out.println("Lista jset pusta");
        }else{
            System.out.println("Lista nie jset pusta");
        }
        // Sprawdzenie czy obiekt znajduje się w liście
        if (strings.contains("Pomidor")){
            System.out.println("obiekt znajduje się w liście");
        }else{
            System.out.println("obiektu nie ma w liście");
        }
    }

    public void mapDescription(){

    }

    public void setDescription(){
        System.out.println(" --- zbiory (set) ---");
        // dodanie elementu do zbioru
        Set<String> setString = new HashSet();
        // dodanie elemntów do zbioru
        setString.add("Pomidor");
        setString.add("Pomidor");
        setString.add("Pomarańcza");
        setString.add("Truskawka");

        System.out.println("Sprawdzenie długości zbioru " + setString.size());

        for (String s : setString){
            System.out.println(s);
        }

        setString.remove("Pomidor");


        System.out.println(" ---------- ");
    }

}
