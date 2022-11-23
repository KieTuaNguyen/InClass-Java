package labotory.Fraction;

import java.util.Scanner;

class Fraction {
  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public void setNumerator(int numer) {
    numerator = numer;
  }

  public void setDenominator(int denomi) {
    if (denomi != 0) {
      denominator = denomi;
    } else {
      System.out.println("Denominator cannot be zero!");
    }
  }

  public void printNormal() {
    System.out.println(numerator + "/" + denominator);
  }

  public void add(Fraction f, Fraction s) {
    int numer = f.getNumerator() * s.getDenominator() + s.getNumerator() * f.getDenominator();
    int denom = f.getDenominator() * s.getDenominator();
    System.out.println(numer + "/" + denom);
  }

  public void subtract(Fraction f, Fraction s) {
    int numer = f.getNumerator() * s.getDenominator() - s.getNumerator() * f.getDenominator();
    int denom = f.getDenominator() * s.getDenominator();
    System.out.println(numer + "/" + denom);
  }

  public void multiply(Fraction f, Fraction s) {
    int numer = f.getNumerator() * s.getNumerator();
    int denom = f.getDenominator() * s.getDenominator();
    System.out.println(numer + "/" + denom);
  }

  public void divide(Fraction f, Fraction s) {
    int numer = f.getNumerator() * s.getDenominator();
    int denom = f.getDenominator() * s.getNumerator();
    System.out.println(numer + "/" + denom);
  }

  public double getDecimal() {
    return (double) numerator / denominator;
  }
}
