package labotory.lab7.Ex3;

import java.io.IOException;

public class TestException3 {
    public static void main(String[] args) {
        try {
            getExceptionA();
        } catch (ExceptionA ea) {
            ea.printStackTrace();
        }

        try {
            getExceptionB();
        } catch (ExceptionB ea) {
            ea.printStackTrace();
        }

        try {
            getNullPointerException();
        } catch (NullPointerException ea) {
            ea.printStackTrace();
        }

        try {
            getIOException();
        } catch (IOException ea) {
            ea.printStackTrace();
        }
    }

    public static void getExceptionA() throws ExceptionA {
        throw new ExceptionA("Exception A");
    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("Exception B");
    }

    public static void getNullPointerException() throws NullPointerException {
        throw new NullPointerException("Null Pointer Exception");
    }

    public static void getIOException() throws IOException {
        throw new IOException("IO Exception");
    }
}
