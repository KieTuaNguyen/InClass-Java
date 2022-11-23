package labotory.Fraction;

import java.sql.Date;
import java.text.DecimalFormat;

public class Candidate {
  private int codeID;
  private String name;
  private String dayOfBirth;
  private double testMark1;
  private double testMark2;

  public Candidate(int codeID, String name, String dayOfBirth, double testMark1, double testMark2) {
    this.codeID = codeID;
    this.name = name;
    this.dayOfBirth = dayOfBirth;
    this.testMark1 = testMark1;
    this.testMark2 = testMark2;
  }

  public int getCodeID() {
    return codeID;
  }

  public void setCodeID(int codeID) {
    this.codeID = codeID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDayOfBirth() {
    return dayOfBirth;
  }

  public void setDayOfBirth(String dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }

  public double getTestMark1() {
    return testMark1;
  }

  public void setTestMark1(double testMark1) {
    this.testMark1 = testMark1;
  }

  public double getTestMark2() {
    return testMark2;
  }

  public void setTestMark2(double testMark2) {
    this.testMark2 = testMark2;
  }

  public void printCandidate() {
    System.out.println("Code ID: " + codeID);
    System.out.println("Name: " + name);
    System.out.println("Day of birth: " + dayOfBirth);
    System.out.println("Test mark 1: " + testMark1);
    System.out.println("Test mark 2: " + testMark2);
  }

  public double averageMark() {
    double averageMark = (((testMark1 + testMark2) / 2) + (testMark2 * 2)) / 3;
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("The average mark is: " + df.format(averageMark));
    System.out.print("Rank: ");
    if (averageMark <= 10 && averageMark >= 8) {
      System.out.println("Good");
    } else if (averageMark < 8 && averageMark >= 7) {
      System.out.println("Fairly good");
    } else if (averageMark < 7 && averageMark >= 5) {
      System.out.println("Average");
    } else if (averageMark < 5 && averageMark >= 0) {
      System.out.println("Fail");
    } else {
      return 0;
    }
    return averageMark;
  }
}
