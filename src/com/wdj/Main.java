package com.wdj;

import java.util.Scanner;

public class Main {

    public static int nrPerson;

    public static void main(String[] args) {
	// write your code here
        nrPerson = 15;

        System.out.println("Witaj w Javie");

        Osoba o1 = new Osoba();
        o1.setId(1);
        o1.setName("Patryk");
        o1.lastName = "Mazurek";

        Osoba o2 = new Osoba(1, "Patryk", "Mazurek");
        System.out.println("wartość stałą " + o2.nr);

        Scanner scan = new Scanner(System.in);
        Osoba o3 = new Osoba();
        System.out.print("Podaj id ");
        o3.setId(scan.nextInt());
        System.out.print("Podaj imię ");
        String lastname = scan.next();
        o3.setName(lastname);
        System.out.print("Podaj Nazwisko ");
        o3.lastName = scan.next();

        HelpMethods hm = new HelpMethods();
//        hm.writeToFile(o3);
        hm.readFromFile();
//        if (o1.equals(o2)){
//            System.out.println("Osoby równe sobie");
//        }else{
//            System.out.println("Osoby nie są równe sobie");
//        }



        System.out.println(o1.toString());
    }
}
