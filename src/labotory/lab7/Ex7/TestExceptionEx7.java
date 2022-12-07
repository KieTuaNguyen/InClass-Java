package labotory.lab7.Ex7;

public class TestExceptionEx7 {
    public static void someMethod() throws Exception {
        try {
            someMethod2();
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new Exception("someMethod exception rethrow");
        }
    }
    public static void someMethod2() throws Exception {
        throw new Exception("someMethod2 exception");
    }
}
