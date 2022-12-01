package labotory.lab6.Ant;

public class Worker extends Ant {
    public Worker() {
        setName("worker");
        setHp(100f);
    }
    @Override
    public String isAlive() {
        return getHp() < 70 ? "Dead" : "Alive";
    }
}
