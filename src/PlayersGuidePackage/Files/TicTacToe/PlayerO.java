package PlayersGuidePackage.Files.TicTacToe;

import java.util.Scanner;

public class PlayerO extends PlayerTemplate{
    public PlayerO(String name, char symbol) {
        super(name, symbol);
    }

    Scanner input = new Scanner(System.in);

    public void askNamePlayerO(){
        System.out.println("Player O, What is your name?");
        String playerName = input.nextLine().toUpperCase();
        setName(playerName);
        System.out.println("Okay Player O, your name is: " + getName() + ".");
    }

    public void askChoicePlayerO(Grid grid) {
        boolean validMove = false;

        while (!validMove) {
            System.out.println(getName() + ", on which ROW want to place " + getSymbol() + "? 0, 1 or 2?");
            int x = input.nextInt();
            System.out.println(getName() + ", on which COLUMN do you want to place " + getSymbol() + "? 0, 1 or 2?");
            int y = input.nextInt();

            if (x >= 0 && x < grid.size || y >= 0 && y < grid.size) {
                boolean moveResult = grid.setValue(getSymbol(), x, y);
                if (moveResult) {
                    System.out.println(grid.printGrid());
                    validMove = true;

                } else {
                    System.out.println("That cell is already occupied. Please choose another.");
                }
            } else {
                System.out.println("OUT OF BOUNDS");
            }
        }
    }
}
