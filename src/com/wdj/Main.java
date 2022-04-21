package com.wdj;

import com.wdj.classes.Employee;
import com.wdj.classes.Manager;
import com.wdj.classes.Person;
import com.wdj.classes.Student;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Witaj w Javie");
        // definicja nowej klasy
        Student o1 = new Student("UP", 2);
        o1.setId(1);
        o1.setName("Patryk");
        o1.lastName = "Mazurek";
        // tworzenie klasy wewnętrznej
        Student.HelpStudent o1h = o1.new HelpStudent();
        o1h.getHelpInfo("Java");
        o1h.getHelpMony();



        // nie jest możliwe utworzenie obirktu typu Person Klasa abstrakcyjna
//        Person o2 = new Person( "Patryk", "Mazurek");

        Employee p1 = new Employee();
        System.out.println(p1.showInfo("teskt", "tekst 1", "tekst 1"
        ,"tekst 1","tekst 1","tekst 1" ));
        p1.setName("Jan");
        p1.lastName = "Kowalski";
        p1.showInfo("Dowolny wiadomość");
        Person o3 = p1;
        Manager m = new Manager();

        System.out.println("obiekt o1 " + o1.getClass());
        Employee e2 = new Employee("Patryk", "Mazurek", 2000.0, 0, LocalDateTime.now());
        System.out.println(p1.compareTo(e2));

        // definicja tabeli obiektów typu Person
        Person[] listaO = new Person[4];
        listaO[0] = o1;
        listaO[1] = p1;
        listaO[2] = new Student("UP", 2);
        listaO[3] = m;


        for (int i = 0; i < listaO.length; i++){
            System.out.println(listaO[i].showInfo());
        }

        Person[] tabPerson = {o1 };
        System.out.println(tabPerson.length);
        tabPerson = Arrays.copyOf(tabPerson, tabPerson.length+2);
        System.out.println(tabPerson.length);



        //        System.out.println(Arrays.deepToString(tabOsoba));
//        System.out.println(Arrays.deepToString(new int[][]{tabInt2}));
//
//        Random rand = new Random();
//        for (int i = 0; i<tabInt2.length; i++){
//            tabInt2[i] = rand.nextInt();
//            System.out.println(tabInt2[i] );
//        }
//
//        Arrays.sort(tabInt2);
//        System.out.println();
//
//        for (int n: tabInt2){
//            System.out.println(n);
//        }
//
//        int[][] tab2size = {
//                { 34, 45, 56, 3},
//                { 24, 45, 23, 4}
//        };

//        int[][] tab2size2 = new int[10][];
//
//        tab2size2[0] = new int[3];
//        tab2size2[1] = new int[4];
//        tab2size2[2] = new int[1];
//
//        String tekst = "dowolny tekst na zajęciach Javy tekst";
////        String tekst = " ";
//        System.out.println("długość tekstu " + tekst.length());
//        if(tekst.trim().isEmpty()){
//            System.out.println("tekst jest pusty");
//        }else{
//            System.out.println("tekst nie jest pusty");
//            char[] tempchar = tekst.toCharArray();
//            String[] tempTekst = tekst.split(" ");
//            System.out.println(Arrays.deepToString(tempTekst));
//            // wyciągniecie tego samego tekstu
//            for (String s : tempTekst){
//                if (s.equals("tekst")){
//                    System.out.println(s);
//                }
//            }
//
//            System.out.println( tekst.substring(0, tekst.indexOf(" ")) );
//            System.out.println(tekst.replace("dowolny", "aktualny"));
//
//            LocalDateTime localDateTime = LocalDateTime.of(2021, 2,4,0,0);
//            GregorianCalendar date = new GregorianCalendar(1902,4,14);
//            System.out.println(localDateTime);
//            if (LocalDateTime.now().isBefore(localDateTime)) {
//                System.out.println("Dowolny teskt");
//            }
//        }

//        Scanner scan = new Scanner(System.in);
//        Osoba o3 = new Osoba();
//        System.out.print("Podaj id ");
//        o3.setId(scan.nextInt());
//        System.out.print("Podaj imię ");
//        String lastname = scan.next();
//        o3.setName(lastname);
//        System.out.print("Podaj Nazwisko ");
//        o3.lastName = scan.next();

//        HelpMethods hm = new HelpMethods();
//        hm.writeToFile(o3);
//        hm.readFromFile();
//        if (o1.equals(o2)){
//            System.out.println("Osoby równe sobie");
//        }else{
//            System.out.println("Osoby nie są równe sobie");
//        }

    }
}
