package PlayersGuidePackage.Files.Hangman;

import java.io.FileNotFoundException;

public class Hangman {
    Dictionary dictionary;
    Report report;

    //Start Game
    public static void main(String[] args) throws FileNotFoundException {

        Hangman hangman = new Hangman();
        Player player = new Player();
        //Keeps track of Game
        do {
            Game game = new Game();
            Language language = hangman.getLanguageFromPlayer(player);

            hangman.setLanguageToPlayerChoice(hangman, game, language);

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

    private void setLanguageToPlayerChoice(Hangman hangman, Game game, Language language) throws FileNotFoundException {
        if (language == Language.NEDERLANDS) {
            hangman.dictionary = new DutchDictionary();
            hangman.report = new DutchReport(game);
        } else if (language == Language.ENGLISH) {
            hangman.dictionary = new EnglishDictionary();
            hangman.report = new EnglishReport(game);
        }
    }

    private Language getLanguageFromPlayer(Player player) {
        System.out.println("Which language do you prefer? Welke taal heeft uw preferentie? \n" +
                "Typ \"Nederlands\" voor Nederlands or \"English\" for English.");
        while (true) {
            String languageChoice = player.getChoice();
            if (languageChoice.contains("nederlands")) {
                return Language.NEDERLANDS;
            } else if (languageChoice.contains("english")) {
                return Language.ENGLISH;
            } else
                System.out.println("Kies een van de twee bovenstaande talen. Choose one of the two languages above.");
        }
    }

    private boolean getChoiceFromPlayer(Player player) {
        System.out.println("Wil je opnieuw spelen? / Do you want to play again?");
        System.out.println("Typ \"Ja\" of \"Nee\". / Type \"Yes\" or \"No\".");
        while (true) {
            String getChoice = player.getChoice();
            if (getChoice.contains("ja") || getChoice.contains("yes")) {
                return true;
            }
            if (getChoice.contains("nee") || getChoice.contains("no")) {
                return false;
            }
        }
    }
}

