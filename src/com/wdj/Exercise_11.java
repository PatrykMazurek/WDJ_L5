package com.wdj;

import com.wdj.classes.BoardGame;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Exercise_11 {


    public void point_a(List<BoardGame>boardGameList){
        boardGameList.stream()
                .filter(g -> g.rating >7.8 && g.rating < 8.5)
                .filter(g -> new BigDecimal("80.0").compareTo(g.price) > 0 )
                .forEach(System.out::println);
    }

    public void point_b(List<BoardGame>boardGameList){
        Long gameCount = boardGameList.stream()
                .filter(g -> g.rating >7.8 && g.rating < 8.5)
                .filter(g -> new BigDecimal("80.0").compareTo(g.price) > 0 )
                .count();

        System.out.println(gameCount);
    }

    public void point_c(List<BoardGame>boardGameList, String name){
        boardGameList.stream().filter(g -> g.name.contains(name)).forEach(System.out::println);
    }

    public BoardGame point_d(List<BoardGame>boardGameList, String sign){
        // do rozwiązania tego zadania należy dopisać metodę zwracającą średnią "getRaitnig()"
        BoardGame bestGame = boardGameList.stream()
                .filter(g -> g.name.contains(sign))
                .max(Comparator.comparing(BoardGame::getRating))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Najlepsz gra zawierająca znaki " + sign + " to:" + bestGame.name);
        return bestGame;
    }

    public void point_e(List<BoardGame>boardGameList){
        double sum = boardGameList.stream().mapToDouble(g -> g.rating).sum();
        double avarange = sum / boardGameList.size();
        System.out.println("średnia ocena dla całej listy " + avarange);
    }

    public void point_f(List<BoardGame>boardGameList){
        List<BoardGame> tempGame = boardGameList.stream()
                .filter(g -> g.year > 2010)
                .collect(Collectors.toList());
        for (BoardGame g : tempGame){
            System.out.println(g.toString());
        }
    }
}
