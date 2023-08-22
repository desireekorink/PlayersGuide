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

    private void fillGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public Grid() {
        this.fillGrid();
    }

    public void setValue(char c, int x, int y) {
        grid[x][y] = c;
    }
}
