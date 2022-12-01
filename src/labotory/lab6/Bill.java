package labotory.lab6;

public class Bill {
    private String customerCode;
    private String customerType;
    private int oldIndexOfWaterMeter;
    private int newIndexOfWaterMeter;

    public Bill(String customerCode, String customerType, int oldIndexOfWater, int newIndexOfWater) {
        setCustomerCode(customerCode);
        setCustomerType(customerType);
        setOldIndexOfWaterMeter(oldIndexOfWater);
        setNewIndexOfWaterMeter(newIndexOfWater);
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public int getOldIndexOfWaterMeter() {
        return oldIndexOfWaterMeter;
    }

    public void setOldIndexOfWaterMeter(int oldIndexOfWaterMeter) {
        this.oldIndexOfWaterMeter = oldIndexOfWaterMeter;
    }

    public int getNewIndexOfWaterMeter() {
        return newIndexOfWaterMeter;
    }

    public void setNewIndexOfWaterMeter(int newIndexOfWaterMeter) {
        this.newIndexOfWaterMeter = newIndexOfWaterMeter;
    }

    public int price() {
        return switch (customerType) {
            case "Resident" -> 500;
            case "Business" -> 400;
            case "Organization" -> 400;
            default -> 300;
        };
    }

    public int payment() {
        int paymentForUsingWater = price() * (newIndexOfWaterMeter - oldIndexOfWaterMeter);
        System.out.println(paymentForUsingWater);
        return paymentForUsingWater;
    }
}