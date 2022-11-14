package com.arthur;

import java.util.Scanner;

public class Lab {
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

    System.out.println("Exercise 10: ");
    Ex10();
    System.out.println("\n");

    System.out.println("Exercise 11: ");
    Ex11();
    System.out.println("\n");

    System.out.println("Exercise 12: ");
    Ex12();
    System.out.println("\n");

    System.out.println("Exercise 13: ");
    Ex13();
    System.out.println("\n");

    System.out.println("Exercise 14: ");
    Ex14();
    System.out.println("\n");
  }

  public static void Ex1() {
    String coreUp = "\\/";
    System.out.println("   " + coreUp);
    System.out.println("  \\" + coreUp + "/");
    System.out.println(" \\\\" + coreUp + "/" + "/");
    String coreDown = "/\\";
    System.out.println(" //" + coreDown + "\\" + "\\");
    System.out.println("  /" + coreDown + "\\");
    System.out.println("   " + coreDown);

  }

  public static void Ex2() {
    System.out.println("\"Several slashes are sometimes seen" + "," + "\"");
    System.out.println("said Sally. \"I've said so.\" See ?");
    String coreUp = "\\ /";
    System.out.print(coreUp);
    System.out.print("  \\" + coreUp + "/");
    System.out.print(" \\\\" + coreUp + "/" + "/");
  }

  public static void Ex3() {
    String doubleLine = "*****\n*****";
    String xShape = " * * \n  *  \n * * ";
    String iShape = "  *  \n  *  \n  *  ";
    System.out.println(doubleLine);
    System.out.println(xShape);
    System.out.println("\n");
    System.out.println(doubleLine);
    System.out.println(xShape);
    System.out.println(doubleLine);
    System.out.println("\n");
    System.out.println(iShape);
    System.out.println(doubleLine);
    System.out.println(xShape);
  }

  public static void Ex4() {
    System.out.println("A \"quoted\" String is");
    System.out.println("'much' better if you learn");
    System.out.println("the rules of \"escape sequences.\"");
    System.out.println("Also, \"\" represents an empty String.");
    System.out.println("Don't forget: use \" instead of \" !");
    System.out.println("'' is not the same as \"");
  }

  public static void Ex5() {
    String top = "   ___  \n /     \\\n/       \\ ";
    String mid = "+-------+";
    String midS = "|  STOP  |";
    String bottom = "\\       /\n \\     /\n   ---  ";
    System.out.println(top);
    System.out.println(bottom);
    System.out.println("\n");
    System.out.println(top);
    System.out.println(bottom);
    System.out.println(mid);
    System.out.println("\n");
    System.out.println(top);
    System.out.println(midS);
    System.out.println(bottom);
    System.out.println(mid);
    System.out.println("\n");
  }

  public static void Ex6() {
    System.out.println("Online");
  }

  public static void Ex7() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter first number: ");
    float firstNum = scnr.nextFloat();
    System.out.println("Enter second number: ");
    float secondNum = scnr.nextFloat();
    System.out.println("---------------------");
    System.out.println("Choose the relevant operation: ");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Remainder");
    int operation = scnr.nextInt();
    switch (operation) {
      case 1:
        System.out.println("Result: " + (firstNum + secondNum));
        break;
      case 2:
        System.out.println("Result: " + (firstNum - secondNum));
        break;
      case 3:
        System.out.println("Result: " + (firstNum * secondNum));
        break;
      case 4:
        System.out.println("Result: " + (firstNum / secondNum));
        break;
      case 5:
        System.out.println("Result: " + (firstNum % secondNum));
        break;
      default:
        System.out.println("Invalid operation");
        break;
    }
  }

  public static void Ex8() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a month: ");
    int month = scnr.nextInt();
    switch (month) {
      case 1, 2, 3:
        System.out.println("The 1st quarter");
        break;
      case 4, 5, 6:
        System.out.println("The 2nd quarter");
        break;
      case 7, 8, 9:
        System.out.println("The 3rd quarter");
        break;
      case 10, 11, 12:
        System.out.println("The 4th quarter");
        break;
      default:
        System.out.println("Invalid!");
        break;
    }
  }

  public static void Ex9() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a month: ");
    int month = scnr.nextInt();
    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("April");
        break;
      case 5:
        System.out.println("May");
        break;
      case 6:
        System.out.println("June");
        break;
      case 7:
        System.out.println("July");
        break;
      case 8:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("October");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
      default:
        System.out.println("Invalid!");
        break;
    }
  }

  public static void Ex10() {
    System.out
        .println("Write a program that enters three numbers, checks if they are three valid sides of a triangle ");
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter first number: ");
    float firstNum = scnr.nextFloat();
    System.out.println("Enter second number: ");
    float secondNum = scnr.nextFloat();
    System.out.println("Enter third number: ");
    float thirdNum = scnr.nextFloat();

    if (firstNum + secondNum >= thirdNum || firstNum + thirdNum >= secondNum || secondNum + thirdNum >= firstNum) {
      System.out.println("Valid triangle.");
    } else {
      System.out.println("Invalid triangle.");
    }
  }

  public static void Ex11() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a month: ");
    int month = scnr.nextInt();
    System.out.println("Enter a year: ");
    int year = scnr.nextInt();
    if (month == 2) {
      if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
        System.out.println("29 days");
      } else {
        System.out.println("28 days");
      }
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      System.out.println("30 days");
    } else {
      System.out.println("31 days");
    }
  }

  public static void Ex12() {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter month");
    int month = scn.nextInt();
    if (month < 1 || month > 12) {
      System.out.print("This is unvalid month: ");
    } else {
      System.out.println("This is valid month");
    }
    System.out.print("Enter year");
    int year = scn.nextInt();
    System.out.println("This is valid year");
    boolean isLeapYear = true;
    System.out.println("Enter day");
    int day = scn.nextInt();

    if (!(year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0)) {
      isLeapYear = false;
    }

    if (day < 1 || day > 31) {
      System.out.println("Invalid day");
    } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        && day > 1 && day < 31) {
      System.out.println("Valid day");
    } else if (month == 2 && isLeapYear && day > 1 && day < 29) {
      System.out.println("Valid day");
    } else if (month == 2 && !isLeapYear && day > 1 && day < 28) {
      System.out.println("Valid day");
    } else {
      System.out.println("Valid day");
    }
  }

  public static void Ex13() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a score: ");
    int score = scnr.nextInt();
    if (score >= 9 && score <= 10) {
      System.out.println("Excellent ");
    } else if (score >= 8 && score < 9) {
      System.out.println("Very good");
    } else if (score >= 7 && score < 8) {
      System.out.println("Good");
    } else if (score > 5 && score < 7) {
      System.out.println("Average");
    } else if (score < 5) {
      System.out.println("Bad");
    } else {
      System.out.println("Error");
    }
  }

  public static void Ex14() {
    Scanner scnr = new Scanner(System.in);
    System.out.println("What color do you want?");
    float color = scnr.nextFloat();
    if (color == 'R') {
      System.out.println("Red");
    } else if (color == 'B') {
      System.out.println("Blue");
    } else if (color == 'G') {
      System.out.println("Green");
    } else {
      System.out.println("Unknown color: " + color);
    }
  }
}
