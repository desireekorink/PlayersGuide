package PlayersGuidePackage.Files.Hangman;

public class EnglishReport extends Report {
    public EnglishReport(Game game) {
        super(game);
    }

    @Override
    public String showReport() {
        return "---------------------------------------------------------------------\n" +
                "Word: " + new String(game.result) + " | Remaining Lives: " + game.lives + " | Incorrect Guesses: " + game.incorrectGuesses + " | Guess: ";

    }

    @Override
    public String showEnd() {
        if (game.lives == 0 && game.contains(game.result, '_')) {
            return "---------------------------------------------------------------------\n" +
                    "Bummer, you lost! The guessed word had to be: " + new String(game.word) + ".";
        }
        return "---------------------------------------------------------------------\n" +
                "Congratulations, you won! The guessed word was " + new String(game.word) + ".";
    }
}
