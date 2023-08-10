package PlayersGuidePackage.Files.Hangman;

import java.io.FileNotFoundException;

public class HangmanGame {
    Dictionary dictionary;

    //Start Game
    public static void main(String[] args) throws FileNotFoundException {
        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.dictionary = new Dictionary();

        //Get Word
        String word = hangmanGame.dictionary.getWord();
        System.out.println(word);
        Report report = new Report(word);
        Player player = new Player();

        //in loop tot einde
        System.out.println(report.showReport());
        char guess = player.getGuess();
        report.Guess(guess);
        System.out.println(report.showReport());
    }


}
//interact with Player


//Keeps track of Report
//Knows if game is lost or won

