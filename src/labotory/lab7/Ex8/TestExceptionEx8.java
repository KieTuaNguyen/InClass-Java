package labotory.lab7.Ex8;

import java.util.*;

public class TestExceptionEx8 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        try {
            try {
                int i;
                System.out.println("Please enter a number: ");
                i = scnr.nextInt();
                double div = (double) 1 / i;
                System.out.println("1/" + i + "= "+ div);
            } catch (InputMismatchException e) {
                System.out.println("Please re-enter a number.");
            }
        } catch (ArithmeticException e) {
            System.err.println("Cannot devide by 0.");
        }
    }
}