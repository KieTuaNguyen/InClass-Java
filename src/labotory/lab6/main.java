package labotory.lab6;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args)
    {
        Employee employee1 = new Employee(12);
        Employee employee2 = new Employee(12);
        employee1.compareTo(employee1, employee2);

        List<Bill> list = new ArrayList<Bill>();
        list.add(new Bill("C01", "Resident", 10, 100));
        list.add(new Bill("C02", "Resident", 20, 30));
        list.add(new Bill("C03", "Business", 10, 50));
        list.add(new Bill("C04", "Organization", 10, 100));
        BillList billList = new BillList(list);
        billList.printBillListInfo();
        System.out.println("Total of specific type (Example Resident): " + billList.total("Resident") + " VND: ");
    }
}
