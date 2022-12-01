package labotory.lab6.Person;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("GCD210002", "Nguyen Tuan Kiet", 1, "Computing", 4);
        System.out.println("-----------Student description----------\n" + student1.description());
        Professor professor1 = new Professor("GCD000001", "Dang Van Tri Minh", 1, "Computing");
        Professor professor2 = new Professor("GCD000003", "Huynh Cong Chien", 1, "Computing");
        System.out.println("\n-----------Professor description----------\n" + professor1.description());
        student1.display();
        professor1.display();
        professor2.display();
    }
}

