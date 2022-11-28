package labotory.lab5.Person;

public class Employee extends Person {
    private String office;
    private int salary;
    private String dateHired;

    public Employee(
            String name,
            String address,
            int phoneNumber,
            String emailAddress,
            String office,
            int salary,
            String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nOffice: " + office +
                "\nSalary: $" + getSalary() +
                "\nDate hired: " + getDateHired();
    }
}