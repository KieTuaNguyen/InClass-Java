package labotory.lab5.Game;

public class ClientClass {
public static void main(String[] args)
{
    PCBasedGame pcBasedGame = new PCBasedGame("Bong Dung Mun Cuoi", 4, 8, 144);
    System.out.println(pcBasedGame);
    System.out.println("--------------------------------");
    BoardGame boardGame = new BoardGame("Bong Dung Mun Khox", 4, 8,60);
    System.out.println(boardGame);
    System.out.println("--------------------------------");
    TriviaGame triviaGame = new TriviaGame("Bong Dung Mun Nghi", "12$", 20);
    System.out.println(triviaGame);
    System.out.println("--------------------------------");
}
}
