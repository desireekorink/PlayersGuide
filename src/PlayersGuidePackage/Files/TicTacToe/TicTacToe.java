package PlayersGuidePackage.Files.TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {

        PlayerX playerX = new PlayerX("Player X", 'X');
        PlayerO playerO = new PlayerO("Player O", 'O');
        Grid grid = new Grid();
        grid.printGrid();

        playerX.askNamePlayerX();
        playerO.askNamePlayerO();
        Game game = new Game();

        while (!game.isGameOver()){
            playerX.askChoicePlayerX(grid);
            game.playerXHasWon();
            playerO.askChoicePlayerO(grid);
            game.playerOHasWon();
        }
    }
}
