package PlayersGuidePackage.Files.Hangman;

import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);

    //Player guesses
    char getGuess() {
        return input.next().toLowerCase().charAt(0);
    }

    //Can answer to play another game
    public String getChoice() {
        return input.nextLine().toLowerCase();
    }
}
