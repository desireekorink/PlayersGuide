package PlayersGuidePackage.Files.TicTacToe;

import java.util.Scanner;

public class Player {

    Scanner input = new Scanner(System.in);

    public String getChoice() {
        return input.next().toUpperCase();
    }


}
