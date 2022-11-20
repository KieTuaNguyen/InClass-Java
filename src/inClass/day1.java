package inClass;

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        System.out.println("Xin chao the gioi!");

        // Read and display a string
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scnr.nextLine();
        System.out.println("Enter your age: ");
        String age = scnr.nextLine();
        System.out.println("Enter your address: ");
        String address = scnr.nextLine();
        System.out.println("Hello ban " + name + " " + age + " tuoi, o " + address + " ;)");

        System.out.println("Enter your previous grade: ");
        float grade = scnr.nextFloat();
        if (grade >= 5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}