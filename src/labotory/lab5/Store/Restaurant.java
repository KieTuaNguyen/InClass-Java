package labotory.lab5.Store;

public class Restaurant extends Store{
    private int numberPeopleEveryYear;
    private double averagePricePerPerson;
    private double averageTaxesPerYear;

    public Restaurant(String name, int numberPeopleEveryYear, double averagePricePerPerson, double averageTaxesPerYear) {
        super(name);
        this.numberPeopleEveryYear = numberPeopleEveryYear;
        this.averagePricePerPerson = averagePricePerPerson;
        this.averageTaxesPerYear = averageTaxesPerYear;
    }

    public int getNumberPeopleEveryYear() {
        return numberPeopleEveryYear;
    }

    public void setNumberPeopleEveryYear(int numberPeopleEveryYear) {
        this.numberPeopleEveryYear = numberPeopleEveryYear;
    }

    public double getAveragePricePerPerson() {
        return averagePricePerPerson;
    }

    public void setAveragePricePerPerson(double averagePricePerPerson) {
        this.averagePricePerPerson = averagePricePerPerson;
    }

    public double getAverageTaxesPerYear() {
        return averageTaxesPerYear;
    }

    public void setAverageTaxesPerYear(double averageTaxesPerYear) {
        this.averageTaxesPerYear = averageTaxesPerYear;
    }

    @Override
    public String toString() {
        return "Name" + getName() +
                "\nThe number of people  are  served  every  year : " + numberPeopleEveryYear +
                "\nThe average price per person: " + averagePricePerPerson +
                "\nThe  average  taxes per  year: " + averageTaxesPerYear;
    }
}
