package labotory.lab5.Person;

public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name,
                   String address,
                   int phoneNumber,
                   String emailAddress,
                   String office,
                   int salary,
                   String dateHired,
                   int officeHours,
                   String rank) {
        super(name,
                address,
                phoneNumber,
                emailAddress,
                office,
                salary,
                dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nOffice hours: " + officeHours +
                "\nRank: " + rank;

    }
}