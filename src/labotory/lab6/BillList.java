package labotory.lab6;

import java.util.ArrayList;
import java.util.List;

public class BillList {
    List<Bill> list = new ArrayList<Bill>();
    private int numberOfBills;

    public BillList(List<Bill> list) {
        setList(list);
        setNumberOfBills(list.size());
    }

    public List<Bill> getList() {
        return list;
    }

    public void setList(List<Bill> list) {
        this.list = list;
    }

    public int getNumberOfBills() {
        return numberOfBills;
    }

    public void setNumberOfBills(int numberOfBills) {
        this.numberOfBills = numberOfBills;
    }

    public double total(String customerType) {
        double total = 0;
        for (Bill bill : list) {
            if (bill.getCustomerType().equals(customerType)) {
                total += bill.payment();
            }
        }
        return total;
    }

    public void remove(String customerCode) {
        list.removeIf(i -> i.getCustomerCode().equals(customerCode));
        setNumberOfBills(list.size());
    }

    public double maxPayment() {
        double maxPayment = 0;
        for (Bill bill : list) {
            if (bill.payment() > maxPayment) {
                maxPayment = bill.payment();
            }
        }
        return maxPayment;
    }

    public void printBillListInfo() {
        System.out.printf("%n%-6s%-15s%-10s%-10s%-10s", "Code", "Type", "Old index", "New index", "Payment (VND)");
        for (Bill bill : list) {
            System.out.printf("%n%-6s%-15s%-10d%-10d%-10d", bill.getCustomerCode(), bill.getCustomerType(), bill.getOldIndexOfWaterMeter(), bill.getNewIndexOfWaterMeter(), bill.payment());
        };
        System.out.println("\nNumber of bill list: " + numberOfBills);
        System.out.println("Max payment: " + maxPayment() + " VND");
    }
}