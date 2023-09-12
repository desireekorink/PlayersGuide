package PlayersGuidePackage.Files.TicTacToe;

import java.util.Scanner;

public class Player {

    Scanner input = new Scanner(System.in);
    Grid grid = new Grid();
    String playerX;
    String playerO;

    public String getPlayerX() {
        System.out.println("Player X will begin. Who will start first?");
        playerX = input.next().toUpperCase();
        return "Okay Player X, your name is: " + playerX + ".";
    }
    public String getPlayerO() {
        System.out.println("Player O, What is your name?");
        playerO = input.next().toUpperCase();
        return "Okay Player O, your name is: " + playerO + ".";
    }

    public Character getChoiceX() {
        char c = 'O';
        System.out.println(playerX + ", on which COLUMN want to place X? 0, 1 or 2?");
        int x = input.nextInt();
        System.out.println(playerX + ", on which ROW do you want to place X? 0, 1 or 2?");
        int y = input.nextInt();
        if (x > grid.size || y > grid.size) {
            System.out.println("OUT OF BOUNDS");
        }
        return grid.setValue(c, x, y);
    }
    public Character getChoiceO() {
        char c = 'O';
        System.out.println(playerO + ", on which COLUMN want to place O? 0, 1 or 2?");
        int x = input.nextInt();
        System.out.println(playerO + ", on which ROW do you want to place O? 0, 1 or 2?");
        int y = input.nextInt();
        if (x > grid.size || y > grid.size){
            System.out.println("OUT OF BOUNDS");
        }
        return grid.setValue(c, x, y);
    }


}
