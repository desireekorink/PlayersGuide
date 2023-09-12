package PlayersGuidePackage.Files.TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player();
        Grid grid = new Grid();

        player.getPlayerX();
        player.getPlayerO();

        while (grid.GridIsFull(false)){
            player.getChoiceX();
            System.out.println(grid.fillGrid());
            player.getChoiceO();
            System.out.println(grid.fillGrid());
        }


        grid.setValue('X', 1, 1);
        grid.setValue('O', 0, 2);

        System.out.println(grid.printGrid());


    }
}
