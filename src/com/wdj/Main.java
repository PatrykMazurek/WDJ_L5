package com.wdj;

import com.wdj.classes.*;
import com.wdj.views.MainWindow;
import com.wdj.views.TableView;

import java.time.LocalDateTime;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // inizjalizacja listy osób
        List<Person> personList = initListPerson();

        // wywołanie rozwiązań do zadania 8
//        Exercise_8 e7 = new Exercise_8();
//        Map<String, List<Person>> tempMap =  e7.point_c(personList);
//        e7.point_d(tempMap);

        // wywołanie zadania 9 i 10

        // wywołanie zadania 11
//        BoardGame game = new BoardGame();
//        List<BoardGame> boardGames = game.initListGame();
//
//        Exercise_11 e11 = new Exercise_11();
//        e11.point_a(boardGames);
    //        new MainWindow();
            new TableView();
//        BoardGame boardGame = new BoardGame();
//
//        List<BoardGame> boardGames = boardGame.initListGame();
//
//        Stream<BoardGame> filtrGame = boardGames.stream();
//
//        filtrGame.filter(g -> g.price.compareTo(new BigDecimal(50)) > 0 &&
//                        g.price.compareTo(new BigDecimal(100)) < 0 )
//                .collect(Collectors.toList());
//
//        filtrGame.map(g -> g.name + " " + g.year).forEach(System.out::println);
//
//          Interfejsy funkcyjne
//        MyIntercaeFunct number =(m, n) -> {
//            if (n > 0){
//                return m + n +1;
//            }
//            return m + n;
//        };
//
//        MyIntercaeFunct number2 = new MyIntercaeFunct() {
//            @Override
//            public int addToNumber(int n1, int n2) {
//                return n1 + n2;
//            }
//        };
//        System.out.println(number.addToNumber(12, 14));
//
//        Function<String, Integer> numb = n -> Integer.parseInt(n);
//        int x = numb.apply("10");
//        System.out.println(x);






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

    static private List<Person> initListPerson(){
        List<Person> personList = new ArrayList<>();

        // stworzenie listy osób
        Student s1 = new Student("UP", 2);
        s1.setName("Robert");
        s1.lastName = "Nowak";
        personList.add(s1);
        Employee e1 = new Employee("Jan", "Nowak", 3000.0, 0, LocalDateTime.now().minusYears(2));
        personList.add(e1);
        Employee e2 = new Employee("Ewa", "Nowak", 34000.0, 5, LocalDateTime.now().minusYears(3));
        personList.add(e2);
        Employee e3 = new Employee("Marek", "Kowalski", 33000.0, 5, LocalDateTime.now().minusYears(3));
        personList.add(e3);
        Student s2 = new Student("UP", 1);
        s2.setName("Kamil");
        s2.lastName = "Wójcik";
        personList.add(s2);
        Student s3 = new Student("UP", 2);
        s3.setName("Karolina");
        s3.lastName = "Lewandowska";
        personList.add(s3);
        Manager m1 = new Manager();
        m1.setName("Ewa");
        m1.lastName = "Woźniak";
        m1.setZarobki(5500);
        m1.setStartPracy(LocalDateTime.now().minusYears(7));
        m1.setBonus(10);
        personList.add(m1);

        return personList;
    }

}
