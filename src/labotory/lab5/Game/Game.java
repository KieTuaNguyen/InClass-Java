package labotory.lab5.Game;

public class Game {
    private String description;
    public Game (String newDescription) {
        setDescription(newDescription);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "\nDescription: " + description;
    }
}
