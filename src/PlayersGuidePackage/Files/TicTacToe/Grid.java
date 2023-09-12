package PlayersGuidePackage.Files.TicTacToe;

public class Grid {
    final int size = 3;

    char[][] grid = new char[size][size];

    public String printGrid() {
        StringBuilder gameGrid = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameGrid.append(" " + grid[i][j] + " ");
                if (j != 2) {
                    gameGrid.append("|");
                }
            }
            if (i != 2) {
                gameGrid.append("\n---+---+---\n");
            }
        }
        return gameGrid.toString();
    }

    public char[] fillGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = ' ';
            }
        }
        return new char[i][j];
    }

    public Grid() {
        this.fillGrid();
    }

    public Character setValue(char c, int i, int j) {
        return grid[i][j] = c;
    }

    public boolean GridIsFull(boolean isFull){
        isFull = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                isFull = grid[i][j] != '\u0000';
            }
        }
        return isFull;
    }
}
