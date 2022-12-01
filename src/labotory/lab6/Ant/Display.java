package labotory.lab6.Ant;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int option;
        List<Ant> listOfAnt = new ArrayList<Ant>();
        do {
            System.out.println("1. Create new ant list");
            System.out.println("2. Damage Ant");
            System.out.println("3. Quit");
            option = scnr.nextInt();
            switch (option) {
                case 1:
                    listOfAnt.clear();
                    while (listOfAnt.size() < 10) {
                        int i = (int) (Math.random() * (3) + 1);
                        switch (i) {
                            case 1 -> listOfAnt.add(new Worker());
                            case 2 -> listOfAnt.add(new Drone());
                            case 3 -> listOfAnt.add(new Queen());
                        }
                    }
                    for (Ant ant : listOfAnt) {
                        System.out.println(ant.getName() +
                                "\t|\t\t\t" + ant.getHp() + "\t|\t\t\t" + ant.isAlive());
                    }
                    break;
                case 2:
                    for (Ant ant : listOfAnt) {
                        ant.damage();
                        System.out.println(ant.getName() +
                                "\t|\t\t\t" + ant.getHp() + "\t|\t\t\t" + ant.isAlive());
                    }
                    break;
                case 3:
                    break;
            }
        } while (option != 3);
    }
}