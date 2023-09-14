package PlayersGuidePackage.Files.TicTacToe;

public class Game {
    Grid grid = new Grid();
    Player player;
    Player playerX = new Player(player.getPlayerX(), 'X');
    Player playerO = new Player(player.getPlayerO(), 'O');

    //game over
    public boolean isGameOver(){

        return isWin('X')|| isWin('O') || isDraw();
            
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
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < grid.size; i++){
            if (grid.grid[i][0] == symbol && grid.grid[i][1] == symbol && grid.grid[i][2] == symbol){
                System.out.println("Congratulations " + (symbol == 'X' ? playerX : playerO) + ", you filled a whole ROW with " + symbol + " .");
                return true; //Row Win
            }
            else if (grid.grid[0][i] == symbol && grid.grid[1][i] == symbol && grid.grid[2][i] == symbol){
                System.out.println("Congratulations " + (symbol == 'X' ? playerX : playerO) + ", you filled a whole COLUMN with " + symbol + " .");
                return true; // Column Win
            }

            else if ((grid.grid[0][0] == symbol && grid.grid[1][1] == symbol && grid.grid[2][2] == symbol ) ||
                    (grid.grid[0][2] == symbol && grid.grid[1][1] == symbol && grid.grid[2][0] == symbol)){
                System.out.println("Congratulations " + (symbol == 'X' ? playerX : playerO) + ", you filled a DIAGONAL LINE with " + symbol + " .");
                return true; //Diagonal wins
            }
        }
        return false;
    }

    //start new game

}
