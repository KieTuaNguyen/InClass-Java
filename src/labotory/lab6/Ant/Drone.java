package labotory.lab6.Ant;

public class Drone extends Ant {
    public Drone() {
        setName("drone");
        setHp(100f);
    }
    @Override
    public String isAlive() {
        return getHp() < 50 ? "Dead" : "Alive";
    }
}
