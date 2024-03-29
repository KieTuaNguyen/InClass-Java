package labotory.lab5.Person;

public class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String emailAddress;

    public Person(String name, String address, int phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return  "\nName: " + name +
                "\nAddress: " + address +
                "\nPhone number: " + phoneNumber +
                "\nEmail address: " + emailAddress;
    }
}