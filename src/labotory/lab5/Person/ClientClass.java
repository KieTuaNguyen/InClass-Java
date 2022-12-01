package labotory.lab5.Person;

public class ClientClass {
    public static void main(String[] args) {
        Person person = new Person ("John", "193 Nguyen Luong Bang ", 113, "JohnyDang@gmail.com");
        System.out.println(person);
        Employee employee = new Employee ("Jay", "123 Ngo Quyen", 112, "JayPark@gmail.com", "FPT", 1000, "01-01-2022");
        System.out.println(employee);
        Faculty faculty = new Faculty ("Jun", "01 Dong Da", 111, "JunVu@gmail.com", "Greenwich", 1500, "01-01-2022", 12, "Junior");
        System.out.println(faculty);
        Staff staff = new Staff ("Jang", "12 Le Duan", 112, "JangHo", "RMIT", 1700, "01-01-2022", "Staff");
        System.out.println(staff);
        Student student = new Student("Jang Mi", "12 Le Lai", 116, "JangHo", 1);
        System.out.println(student);
        
    }
}
