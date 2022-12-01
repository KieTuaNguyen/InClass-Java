package labotory.lab6.Person;

public class Student extends Person {
    protected String degreeProgram;
    protected int yearOfGraduation;

    public Student(String code, String name, int rank, String degreeProgram, int yearOfGraduationt) {
        super(code, name, rank);
        this.degreeProgram = degreeProgram;
        this.yearOfGraduation = yearOfGraduationt;
    }

    @Override
    public String description() {
        return String.format("%-10s%-20s%-10s%-20s" +
                        "%n%-10d%-20s%-10d%-20s" +
                        "%n%-10d%-20s%-10d%-20s" +
                        "%n%-10d%-20s%-10d%-20s" +
                        "%n%-10d%-20s%-10d%-20s", "Rank", "Description", "Rank", "Description",
                0, "None", 4, "Senior",
                1, "Freshman", 5, "Graduate",
                2, "Sophomore", 6, "Master Postgraduate",
                3, "Junior", 7, "PhD Postgraduate");
    }

    @Override
    public void display() {
        System.out.printf("%s%n%s: %s%n%s: %s%n%s: %d%n%s: %s%n%s: %d",
                "-----------The information of student----------", "Code", code, "Name", name, "Rank", rank, "Degree Program", degreeProgram,
                "Year of graduation", yearOfGraduation);
        System.out.println();
    }
}