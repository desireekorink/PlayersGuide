package PlayersGuidePackage.Files.Hangman;

import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);

    char getGuess() {
        return input.next().charAt(0);
        //Player guesses
        //Can answer to play another game
    }

    public String chooseLanguage() {
        return input.nextLine().toLowerCase();
    }
}
