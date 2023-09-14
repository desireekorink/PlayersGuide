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

    public void fillGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public Grid() {
        this.fillGrid();
    }

    public boolean setValue(char c, int i, int j) {
        if (i >= 0 && i < size && j >= 0 && j < size && grid[i][j] == ' ') {
            grid[i][j] = c;
            return true;
        }
        return false;
    }
}

