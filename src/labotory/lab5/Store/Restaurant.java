package labotory.lab5.Store;

public class Restaurant extends Store {
    private int numberPeopleEveryYear;
    private double averagePricePerPerson;

    public Restaurant(String name, int numberPeopleEveryYear, double averagePricePerPerson) {
        super(name);
        this.numberPeopleEveryYear = numberPeopleEveryYear;
        this.averagePricePerPerson = averagePricePerPerson;
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

    public double getAvgTaxesPerYear() {
        return (double) (numberPeopleEveryYear * averagePricePerPerson * SALEJAZJATE);
    }

    @Override
    public String toString() {
        return "Name" + getName() +
                "\nThe number of people  are  served  every  year : " + numberPeopleEveryYear +
                "\nThe average price per person: " + averagePricePerPerson +
                "\nThe  average  taxes per  year: " + getAvgTaxesPerYear();
    }
}
