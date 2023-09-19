package PlayersGuidePackage.Files.TicTacToe;

public class PlayerTemplate {
    private String name;
    private final char symbol;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public PlayerTemplate(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
}