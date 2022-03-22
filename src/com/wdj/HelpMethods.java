package com.wdj;

import java.io.*;

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

    public void writeToFile(Osoba o){
        File file = new File("Osoba.txt");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(o.toString() + "\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
