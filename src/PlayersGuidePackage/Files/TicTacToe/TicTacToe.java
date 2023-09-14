package PlayersGuidePackage.Files.TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {


        Player playerX = new Player("Player X", 'X');
        Player playerO = new Player("Player O", 'O');
        Grid grid = new Grid();
        grid.printGrid();

        playerX.askNamePlayerX();
        playerO.askNamePlayerO();
        Game game = new Game();

        while (!game.isGameOver()){
            playerX.askPlayerChoice(grid);
            playerO.askPlayerChoice(grid);
        }
    }
}
