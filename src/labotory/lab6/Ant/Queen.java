package labotory.lab6.Ant;

public class Queen extends Ant {
    public Queen() {
        setName("queen");
        setHp(100f);
    }
    @Override
    public String isAlive() {
        return getHp() < 20 ? "Dead" : "Alive";
    }
}
