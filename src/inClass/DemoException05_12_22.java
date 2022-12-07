package inClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException05_12_22 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();;
        testCase1(a, b);
        testCase2(a, b);
    }
    public static void testCase1 (int a, int b) {
        try {
            Scanner scnr = new Scanner (System.in);
            System.out.println("a / b: " + a/b);
        }
        catch (InputMismatchException e) {
            System.out.println("Vui long nhap dung dinh dang cua so" + e.getMessage());
        }
        catch (Exception e) {

        }
        finally {
            System.out.println("This is finally statement");
        }
        return;
    }
    public static void testCase2 (int a, int b) throws ArithmeticException {
        Scanner scnr = new Scanner (System.in);
        if (b == 0) throw new ArithmeticException ("Invalid 0 divisions");
    }
}