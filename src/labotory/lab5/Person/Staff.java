package labotory.lab5.Person;

public class Staff extends Employee{
    private String title;

    public Staff(String name,
                   String address,
                   int phoneNumber,
                   String emailAddress,
                   String office,
                   int salary,
                   String dateHired,
                   String title) {
        super(name,
                address,
                phoneNumber,
                emailAddress,
                office,
                salary,
                dateHired);
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nTitle: " + title;
    }
}
