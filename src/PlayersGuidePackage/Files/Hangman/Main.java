package PlayersGuidePackage.Files.Hangman;

import java.io.FileNotFoundException;

public class Main {
    //Start Game
    public static void main(String[] args) throws FileNotFoundException {

        Hangman hangman = new Hangman();
        Player player = new Player();
        //Keeps track of Game
        do {
            Game game = new Game();
            Language language = hangman.getLanguageFromPlayer(player);

            hangman.setLanguageToPlayerChoice(game, language);

            String word = hangman.dictionary.getWord();
            game.setWord(word);

            while (game.isActive()) {
                System.out.print(hangman.report.showReport());
                char guess = player.getGuess();
                game.Guess(guess);
            }
            //Knows if game is lost or won
            System.out.println(hangman.report.showEnd());
        } while (hangman.getChoiceFromPlayer(player));
    }
}
