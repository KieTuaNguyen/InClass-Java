package labotory;

import java.time.Year;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class lab2 {
  public static void main(String[] args) {
     System.out.println("Exercise 1: ");
     Ex1();
     System.out.println("\n");

     System.out.println("Exercise 2: ");
     Ex2();
     System.out.println("\n");

     System.out.println("Exercise 3: ");
     Ex3();
     System.out.println("\n");

     System.out.println("Exercise 4: ");
     Ex4();
     System.out.println("\n");

     System.out.println("Exercise 5: ");
     Ex5();
     System.out.println("\n");

     System.out.println("Exercise 6: ");
     Ex6();
     System.out.println("\n");

    System.out.println("Exercise 7: ");
    Ex7();
    System.out.println("\n");

    System.out.println("Exercise 8: ");
    Ex8();
    System.out.println("\n");

    System.out.println("Exercise 9: ");
    Ex9();
    System.out.println("\n");

    // System.out.println("Exercise 10: ");
    // Ex10();
    // System.out.println("\n");

  }

  public static void Ex1() {

    for (int x = 1; x <= 5; x++) {
      for (int y = 9; y >= 0; y--) {
        for (int z = 1; z <= 5; z++) {
          System.out.print(y);
        }
      }
      System.out.print("\n");
    }
  }

  public static void Ex2() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int min = scnr.nextInt();
    System.out.println("Enter the second number: ");
    int max = scnr.nextInt();
    System.out.println("-------------------------");

    if (min == max) {
      System.out.print(max);
      return;
    }

    for (int i = min; i <= max; i++) {
      int j = i;
      for (j = i; j <= max; j++) {
        System.out.print(j);
      }
      for (j = min; j < i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void Ex3() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Checking a prime number: ");
    int prime = scnr.nextInt();
    System.out.println("-------------------------");
    for (int i = 2; i < Math.sqrt(prime); i++) {
      if (prime % i == 0) {
        System.out.println("It is not a prime number.");
        return;
      }
    }
    System.out.println("It is a prime number.");
    System.out.println("-------------------------");
    System.out.println("Print out prime sub-multiples of number n");
    for (int i = 1; i <= prime; i++) {
      if (prime % i == 0) {
        System.out.print(i);
      }
    }
    System.out.println("-------------------------");
    System.out.println("Generate the first 100 prime numbers");
    int countP = 0;
    int checkP = 0;

    for (int i = 1; countP <= 100; i++) {
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          ;
          checkP++;
        }
      }
      if (checkP == 2) {
        System.out.println(i);
        countP++;
      }
      checkP = 0;
    }
  }

  public static void Ex4() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = scnr.nextInt();
    System.out.println("-------------------------");
    int sum = 0;
    while (number != 0) {
      sum += number % 10;
      number /= 10;
    }
    System.out.println("The sum of the number's numerals is: " + sum);
  }

  public static void Ex5() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = scnr.nextInt();
    System.out.println("-------------------------");
    System.out.println("The number is " + number);
    System.out.println("-------------------------");
    int reserve = 0;
    while (number != 0) {
      reserve = reserve * 10 + number % 10;
      number /= 10;
    }
    System.out.println("The reserve of the number is: " + reserve);
  }

  public static void Ex6() {
    Scanner input = new Scanner(System.in);
    System.out.print("Number of elements in the array= ");
    int n = input.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Number " + (i + 1) + ": ");
      a[i] = input.nextInt();
    }
    System.out.print("The last index of the value: ");
    int number = input.nextInt();
    int lastIndexOf = -1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == number)
        lastIndexOf = i;
    }
    System.out.println("The last index of the value: " + number + " is " + lastIndexOf + ". ");
  }

  public static void Ex7() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = scnr.nextInt();
    System.out.println("-------------------------");
    int[] array = new int[size];
    int min = 0;
    int max = 0;
    for (int i = 0; i < size; i++) {
      System.out.println("Number " + (i + 1) + ": ");
      array[i] = scnr.nextInt();
      if (i == 0) {
        min = array[i];
        max = array[i];
      }
      if (array[i] > max) {
        max = array[i];
      }
      if (array[i] < min) {
        min = array[i];
      }
    }
    System.out.println("Smallest: " + min);
    System.out.println("Largest: " + max);
  }

  public static void Ex8() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = scnr.nextInt();
    System.out.println("-------------------------");
    int[] array = new int[size];
    int max = 0;
    int sum = 0;
    for (int i = 0; i < size; i++) {
      System.out.println("Number " + (i + 1) + ": ");
      array[i] = scnr.nextInt();
      if (i == 0 && array[i] % 2 == 0) {
        max = array[i];
      }
      if ((array[i] > max) && (array[i] % 2 == 0)) {
        max = array[i];
        sum += array[i];
      }
    }
    System.out.println("The even max: " + max);
    System.out.println("The sum of the even: " + sum);
  }

  public static void Ex9() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = scnr.nextInt();
    System.out.println("-------------------------");
    int[] array = new int[size];
    int odd = 0;
    for (int i = 0; i < size; i++) {
      System.out.println("Number " + (i + 1) + ": ");
      array[i] = scnr.nextInt();
    }
    odd = array[(array.length - 1) / 2];
    System.out.println("The median of the entered odd array is: " + odd);
  }

  public static void Ex10() {

  }

}