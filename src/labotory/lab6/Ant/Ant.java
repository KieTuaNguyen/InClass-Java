package labotory.lab6.Ant;

public class Ant {
private String name;
private float hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = (int) hp;
    }

    public Ant(){}
    public Ant(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }
    public void damage() {
        if (isAlive().equals("Dead")) {
return;
        }
        int i = (int) (Math.random() * 100);
        setHp(getHp() * i / 100);
    }

public String isAlive() {
    return null;
}
}

