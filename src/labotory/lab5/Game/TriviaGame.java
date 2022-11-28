package labotory.lab5.Game;

public class TriviaGame extends Game {
    private String moneyPrize;
    private int numberOfQuestions;

    public TriviaGame(String description, String moneyPrize, int numberOfQuestions) {
        super(description);
        this.moneyPrize = moneyPrize;
        this.numberOfQuestions = numberOfQuestions;
    }

    public String getMoneyPrize() {
        return moneyPrize;
    }

    public void setMoneyPrize(String moneyPrize) {
        moneyPrize = moneyPrize;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    @Override
    public String toString() {
        return "Description" + getDescription() +
                "\nThe  ultimate  money  prize,: " + moneyPrize +
                "\nThe  number  of questions that must be answered to win the ultimate money: " + numberOfQuestions;
    }
}
