package PlayersGuidePackage.Files.Hangman;

import java.io.FileNotFoundException;

public class Hangman {
    Dictionary dictionary;
    Report report;

    //Start Game
    public static void main(String[] args) throws FileNotFoundException {
        Hangman hangman = new Hangman();
        Player player = new Player();
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
        System.out.println(hangman.report.showEnd());
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

    private Language getLanguageFromPlayer(Player player) throws FileNotFoundException {
        System.out.println("Which language do you prefer? Welke taal heeft uw preferentie? \n" +
                "Typ \"Nederlands\" voor Nederlands or \"English\" for English.");
        while (true) {
            String kiesTaal = player.chooseLanguage();
            if (kiesTaal.contains("nederlands")) {
                return Language.NEDERLANDS;
            } else if (kiesTaal.contains("english")) {
                return Language.ENGLISH;
            } else
                System.out.println("Kies een van de twee bovenstaande talen. Choose one of the two languages above.");
        }
    }

}
//interact with Player


//Keeps track of Game
//Knows if game is lost or won

