package labotory.Fraction;

import java.sql.Date;
import java.util.Scanner;

public class lab3 {
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
  }

  public static void Ex1() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the numerator of the first fraction: ");
    int firstNumer = input.nextInt();
    System.out.print("Enter the denominator of the first fraction: ");
    int firstDenom = input.nextInt();
    System.out.print("Enter the numerator of the second fraction: ");
    int secondNumer = input.nextInt();
    System.out.print("Enter the denominator of the second fraction: ");
    int secondDenom = input.nextInt();
    Fraction f = new Fraction(firstNumer, firstDenom);
    Fraction s = new Fraction(secondNumer, secondDenom);
    System.out.println("--------------------");
    System.out.println("The first fraction is: ");
    f.printNormal();
    System.out.println("The second fraction is: ");
    s.printNormal();
    System.out.println("--------------------");
    System.out.print("The sum of the two fractions is: ");
    f.add(f, s);
    System.out.print("The difference of the two fractions is: ");
    f.subtract(f, s);
    System.out.print("The product of the two fractions is: ");
    f.multiply(f, s);
    System.out.print("The quotient of the two fractions is: ");
    f.divide(f, s);
    System.out.println("--------------------");
    System.out.println("The decimal value of the first fraction is: ");
    f.getDecimal();
    System.out.println("The decimal value of the second fraction is: ");
    s.getDecimal();
  }

  public static void Ex2() {
    Scanner input = new Scanner(System.in);
    Fraction[] tenFractions = new Fraction[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter the numerator of the " + (i + 1) + " fraction: ");
      int firstNumer = input.nextInt();
      System.out.print("Enter the denominator of the " + (i + 1) + " fraction: ");
      int firstDenom = input.nextInt();
      tenFractions[i] = new Fraction(firstNumer, firstDenom);
    }
    for (int i = 0; i < 10; i++) {
      System.out.print("The " + (i + 1) + " fraction is: ");
      tenFractions[i].printNormal();
    }
    System.out.println("--------------------");
    Fraction largest = tenFractions[0];
    Fraction secondLargest = tenFractions[0];
    for (int i = 0; i < 10; i++) {
      if (tenFractions[i].getDecimal() > largest.getDecimal()) {
        secondLargest = largest;
        largest = tenFractions[i];
      } else if (tenFractions[i].getDecimal() > secondLargest.getDecimal()) {
        secondLargest = tenFractions[i];
      }
    }
    System.out.print("The largest fraction is: ");
    largest.printNormal();
    System.out.print("The second largest fraction is: ");
    secondLargest.printNormal();
    System.out.print("The sum of the two largest fractions is: ");
    largest.add(largest, secondLargest);
    System.out.println("--------------------");
    for (int i = 0; i < 10; i++) {
      for (int j = i + 1; j < 10; j++) {
        if (tenFractions[i].getDecimal() > tenFractions[j].getDecimal()) {
          Fraction temp = tenFractions[i];
          tenFractions[i] = tenFractions[j];
          tenFractions[j] = temp;
        }
      }
    }
    System.out.println("The fractions in ascending order are: ");
    for (int i = 0; i < 10; i++) {
      System.out.print((i + 1) + ". ");
      tenFractions[i].printNormal();
    }
  }

  public static void Ex3() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the abscissa of the first point: ");
    int x1 = input.nextInt();
    System.out.println("Enter the ordinate of the first point: ");
    int y1 = input.nextInt();
    System.out.println("Enter the abscissa of the second point: ");
    int x2 = input.nextInt();
    System.out.println("Enter the ordinate of the second point: ");
    int y2 = input.nextInt();

    Point f = new Point(x1, y1);
    Point s = new Point(x2, y2);

    System.out.println("The A point is: ");
    f.printXY();
    System.out.println("The B point is: ");
    s.printXY();

    System.out.println("The distance between the two points is: ");
    f.distance(f, s);

    System.out.println("Enter the abscissa of the third point: ");
    int x3 = input.nextInt();
    System.out.println("Enter the ordinate of the third point: ");
    int y3 = input.nextInt();
    Point t = new Point(x3, y3);

    System.out.println("The C point is: ");
    t.printXY();

    System.out.println("The area of a triangle formed by the three points above is: ");
    f.areaTriangle(f, s, t);
  }

  public static void Ex4() {
    Scanner input = new Scanner(System.in);
    Point[] tenPoints = new Point[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter the abscissa of the " + (i + 1) + " point: ");
      int x = input.nextInt();
      System.out.print("Enter the ordinate of the " + (i + 1) + " point: ");
      int y = input.nextInt();
      tenPoints[i] = new Point(x, y);
    }
    for (int i = 0; i < 10; i++) {
      System.out.println("The " + (i + 1) + " point: ");
      tenPoints[i].printXY();
    }
  }

  public static void Ex5() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the codeID of the candidate: ");
    int codeID = input.nextInt();
    System.out.println("Enter the name of the candidate: ");
    String name = input.next();
    System.out.println("Enter the day of birth of the candidate: ");
    String dayOfBirth = input.next();
    System.out.println("Enter the test mark 1:");
    double testMark1 = input.nextDouble();
    System.out.println("Enter the test mark 2:");
    double testMark2 = input.nextDouble();
    Candidate p = new Candidate(codeID, name, dayOfBirth, testMark1, testMark2);
    System.out.println("--------------------");
    System.out.println("The candidate's information is: ");
    p.printCandidate();
    System.out.println("The candidate's average mark is: ");
    p.averageMark();
  }

  public static void Ex6() {
    Scanner input = new Scanner(System.in);
    Candidate[] tenCandidates = new Candidate[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter the codeID of the " + (i + 1) + " candidate: ");
      int codeID = input.nextInt();
      System.out.print("Enter the name of the " + (i + 1) + " candidate: ");
      String name = input.next();
      System.out.print("Enter the day of birth of the " + (i + 1) + " candidate: ");
      String dayOfBirth = input.next();
      System.out.print("Enter the test mark 1 of the " + (i + 1) + " candidate: ");
      double testMark1 = input.nextDouble();
      System.out.print("Enter the test mark 2 of the " + (i + 1) + " candidate: ");
      double testMark2 = input.nextDouble();
      tenCandidates[i] = new Candidate(codeID, name, dayOfBirth, testMark1, testMark2);
    }
    int count = 0;
    for (int i = 0; i < 10; i++) {
      if (tenCandidates[i].averageMark() >= 5) {
        count++;
      }
    }
    System.out.println("The number of students pass is: " + count);
    for (int i = 0; i < 10; i++) {
      if (tenCandidates[i].averageMark() >= 5) {
        System.out.println("The name of the student who passed the exam is: " + tenCandidates[i].getName());
      }
    }
  }
}
