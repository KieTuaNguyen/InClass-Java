package labotory.lab6.Person;

public class Professor extends Person {
    protected String department;

    public Professor(String code, String name, int rank, String department) {
        super(code, name, rank);
        this.department = department;
    }

    @Override
    public String description() {
        return String.format("%-10s%-20s%-10s%-20s" +
                        "%n%-10d%-20s" +
                        "%n%-10d%-20s%-10d%-20s" +
                        "%n%-10d%-20s%-10d%-20s" +
                        "%n%-10d%-20s%-10d%-20s",
                "Rank", "Description", "Rank", "Description",
                0, "None",
                1, "Associate Professor", 4, "Assistant Teaching Professor",
                2, "Associate Professor", 5, "Assistant Teaching Professor",
                3, "Professor", 6, "Teaching Professor");
    }

    @Override
    public void display() {
        System.out.printf("%s%n%s: %s%n%s: %s%n%s: %d%n%s: %s",
                "----------The information of professor----------", "Code", code, "Name", name, "Rank", rank,
                "Department", department);
        System.out.println();
    }


}
