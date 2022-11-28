package labotory.lab5.Store;

public class Store {
    public double SALEJAZJATE = 0.06;
    private String name;

    public Store(String newName) {
        setName(newName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
