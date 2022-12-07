package labotory.lab7.Ex5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptionEx5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        try {
            System.out.println("Enter A: ");
            int a = scnr.nextInt();
            System.out.println("Enter B: ");
            int b = scnr.nextInt();
            System.out.println("Division of a and b: " + a / b);
        } catch (InputMismatchException ea) {
            System.out.println("Vui long nhap dung dinh dang cua so");
        } catch (ArithmeticException ea) {
            System.out.println("Khong chia duoc cho so 0");
        }
    }
}