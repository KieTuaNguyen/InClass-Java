package labotory.lab7.Ex6;

import java.util.*;

public class SomeException {
    public static void main(String[] args) {
        try {
            SomeException someException = new SomeException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SomeException() {
        int a =1;
        int b = 0;
        Scanner scnr = new Scanner(System.in);
        try {
            System.out.println("Enter A: ");
            a = scnr.nextInt();
            System.out.println("Enter B: ");
             b = scnr.nextInt();
            int sum = a+b;
            System.out.println("Sum between A and B: " + sum);
            int minus = a-b;
            System.out.println("Difference between A and B: " + minus);
            int mul = a*b;
            System.out.println("Multiple of A and B: " + mul);
            double div = (double) a/b;
            System.out.println("Division of A and B: " + div);
        }
        catch (InputMismatchException e) {
            System.out.println("Please re-enter a number.");
        }
        catch (ArithmeticException e) {
            System.err.println("Cannot devide by 0:");
        }
        finally {
            System.out.println("----");
        }
    }
}
