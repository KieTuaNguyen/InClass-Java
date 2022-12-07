package labotory.lab7.Ex4;

import java.io.IOException;

public class CatchThree {
    public static void CatchThree () {
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
            getExceptionC();
        } catch (ExceptionC ea) {
            ea.printStackTrace();
        }
    }

    public static void getExceptionA() throws ExceptionA {
        throw new ExceptionA("Exception A");
    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("Exception B");
    }
    public static void getExceptionC() throws ExceptionC {
        throw new ExceptionC("Exception C");
    }
}

