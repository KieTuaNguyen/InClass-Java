package labotory.lab6;

public class Employee extends main {
    private int age;

    public Employee(int age) {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void compareTo(Employee employee1, Employee employee2) {
        if (employee1.getAge() == employee2.getAge()) {
            System.out.println("0");
        } else if (employee1.getAge() < employee2.getAge()) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
