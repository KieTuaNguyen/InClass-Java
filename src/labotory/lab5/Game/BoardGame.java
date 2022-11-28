package labotory.lab5.Game;

public class BoardGame extends Game {
    private int minNumOfPlayers;
    private int maxNumOfPlayers;
    private int timeLimit;

public BoardGame(String description, int minNumOfPlayers, int maxNumOfPlayers, int timeLimit) {
    super(description);
    this.minNumOfPlayers = minNumOfPlayers;
    this.maxNumOfPlayers = maxNumOfPlayers;
    this.timeLimit = timeLimit;
}

    public int getMinNumOfPlayers() {
        return minNumOfPlayers;
    }

    public void setMinNumOfPlayers(int minNumOfPlayers) {
        this.minNumOfPlayers = minNumOfPlayers;
    }

    public int getMaxNumOfPlayers() {
        return maxNumOfPlayers;
    }

    public void setMaxNumOfPlayers(int maxNumOfPlayers) {
        this.maxNumOfPlayers = maxNumOfPlayers;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return "Description" + getDescription() +
                "\nThe minimum number of players: " + minNumOfPlayers +
                "\nThe maximum number of players: " + maxNumOfPlayers +
                "\nThe time limit to finish the game: " + timeLimit;
    }
}
