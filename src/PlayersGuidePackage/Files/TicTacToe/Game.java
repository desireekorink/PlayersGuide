package PlayersGuidePackage.Files.TicTacToe;

public class Game {
    private final Grid grid;
    private final PlayerX playerX;
    private final PlayerO playerO;

    public Game() {
        grid = new Grid(); // Initialize the grid here
        playerX = new PlayerX("Player X", 'X');
        playerO = new PlayerO("Player O", 'O');
    }

    //game over
    public boolean isGameOver(){
        return isWin(playerX.getSymbol())|| isWin(playerO.getSymbol()) || isDraw();
    }



    private boolean isDraw() {
        // Check if all cells are filled (grid is full)
        for (int i = 0; i < grid.size; i++){
            for (int j = 0; j < grid.size; j++){
                if (grid.grid[i][j] != 'X' && grid.grid[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWin(char symbol) {
        for (int i = 0; i < grid.size; i++){
            if (grid.grid[i][0] == symbol && grid.grid[i][1] == symbol && grid.grid[i][2] == symbol){
                return true; //Row Win
            }
            else if (grid.grid[0][i] == symbol && grid.grid[1][i] == symbol && grid.grid[2][i] == symbol){
                return true; // Column Win
            }

            else if ((grid.grid[0][0] == symbol && grid.grid[1][1] == symbol && grid.grid[2][2] == symbol ) ||
                    (grid.grid[0][2] == symbol && grid.grid[1][1] == symbol && grid.grid[2][0] == symbol)){
                return true; //Diagonal wins
            }
        }
        return false;
    }

    public boolean checkWin(char symbol) {
        return isWin(symbol);
    }

    public void playerXHasWon(){
        if (checkWin(playerX.getSymbol())){
            System.out.println(playerX.getName() + "has Won!");
        }
    }

    public void playerOHasWon(){
        if (checkWin(playerO.getSymbol())){
            System.out.println(playerO.getName() + "has Won!");
        }
    }

    //start new game

}
