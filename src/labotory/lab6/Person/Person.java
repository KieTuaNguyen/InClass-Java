package labotory.lab6.Person;

import java.util.List;

public abstract class Person {
    protected String code;
    protected String name;
    protected int rank;

    public Person(String code, String name, int rank) {
        this.code = code;
        this.name = name;
        this.rank = rank;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }
    public abstract String description();
    public void display() {
        System.out.println(
                "Employee code: " + code +
                "%nEmployee name: " + name +
                "%nRank: " + rank);
    }
}
