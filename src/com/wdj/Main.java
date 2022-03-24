package com.wdj;

import java.time.LocalDateTime;
import java.util.*;

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
//        System.out.println("wartość stałą " + o2.nr);

        int[] tabInt = {12, 45, 34, 23, 4};
        int[] tabInt2 = new int[10];

        Osoba[] tabOsoba = {o1, o2};
        System.out.println(tabOsoba.length);
        tabOsoba = Arrays.copyOf(tabOsoba, tabOsoba.length+2);
        System.out.println(tabOsoba.length);

        System.out.println(Arrays.deepToString(tabOsoba));
        System.out.println(Arrays.deepToString(new int[][]{tabInt2}));

        Random rand = new Random();
        for (int i = 0; i<tabInt2.length; i++){
            tabInt2[i] = rand.nextInt();
            System.out.println(tabInt2[i] );
        }

        Arrays.sort(tabInt2);
        System.out.println();

        for (int n: tabInt2){
            System.out.println(n);
        }

        int[][] tab2size = {
                { 34, 45, 56, 3},
                { 24, 45, 23, 4}
        };

        int[][] tab2size2 = new int[10][];

        tab2size2[0] = new int[3];
        tab2size2[1] = new int[4];
        tab2size2[2] = new int[1];

        String tekst = "dowolny teks na zajęciach Javy";
//        String tekst = " ";
        System.out.println("długość tekstu " + tekst.length());
        if(tekst.trim().isEmpty()){
            System.out.println("tekst jest pusty");
        }else{
            System.out.println("tekst nie jest pusty");
            char[] tempchar = tekst.toCharArray();
            String[] tempTekst = tekst.split(" ");
            System.out.println(Arrays.deepToString(tempTekst));

            System.out.println( tekst.substring(0, tekst.indexOf(" ")) );
            System.out.println(tekst.replace("dowolny", "aktualny"));

            LocalDateTime localDateTime = LocalDateTime.of(2021, 2,4,0,0);
            GregorianCalendar date = new GregorianCalendar(1902,4,14);
            System.out.println(localDateTime);
            if (LocalDateTime.now().isBefore(localDateTime)) {
                System.out.println("Dowolny teskt");
            }
            System.out.println();
            System.out.println(date.get(Calendar.SHORT_FORMAT));
        }

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
