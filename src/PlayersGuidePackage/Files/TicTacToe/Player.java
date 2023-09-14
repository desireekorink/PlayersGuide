package PlayersGuidePackage.Files.TicTacToe;

import java.util.Scanner;

public class Player {

    Scanner input = new Scanner(System.in);
    Grid grid = new Grid();

    private String name;
    private char symbol;

    private String playerX;
    private String playerO;

    public String getName(){
        return name;
    }

    public char getSymbol(){
        return symbol;
    }

    public Player(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }

    Game game = new Game();


    public void askNamePlayerX() {
        System.out.println("Player X will begin. Who will start first?");
        playerX = input.next().toUpperCase();
        System.out.println("Okay Player X, your name is: " + playerX + ".");
    }
    public void askNamePlayerO(){
        System.out.println("Player O, What is your name?");
        playerO = input.next().toUpperCase();
        System.out.println("Okay Player O, your name is: " + playerO + ".");
    }


    public String getPlayerX(){
        name = playerX;
        symbol = 'X';
        return playerX;
    }

    public String getPlayerO(){
        name = playerO;
        symbol = 'O';
        return playerO;
    }

    public boolean askPlayerChoice(Grid grid) {
        boolean validMove = false;

        while (!validMove) {
            System.out.println(playerX + ", on which ROW want to place " + getSymbol() + "? 0, 1 or 2?");
            int x = input.nextInt();
            System.out.println(playerO + ", on which COLUMN do you want to place " + getSymbol() + "? 0, 1 or 2?");
            int y = input.nextInt();

            if (x >= 0 && x < grid.size || y >= 0 && y < grid.size) {
                boolean moveResult = grid.setValue(getSymbol(), x, y);
                if (moveResult) {
                    System.out.println(grid.printGrid());
                    validMove = true;

                    //Check if move in the winning move
                    boolean hasWon = game.isWin(getSymbol());
                    if (hasWon){
                        System.out.println(game.isWin(getSymbol()));
                        return true;
                    }
                } else {
                    System.out.println("That cell is already occupied. Please choose another.");
                }
            } else {
                System.out.println("OUT OF BOUNDS");
            }
        }
        return true;
    }
}
