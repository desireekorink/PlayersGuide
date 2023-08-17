package PlayersGuidePackage.Files.Hangman;

public class DutchReport extends Report {

    public DutchReport(Game game) {
        super(game);
    }

    @Override
    public String showReport() {
        return "---------------------------------------------------------------------\n" +
                "Woord: " + new String(game.result) + " | Resterende Levens: " + game.lives + " | Onjuist geraden letters: " + game.incorrectGuesses + " | Gok: ";

    }

    @Override
    public String showEnd() {
        if (game.lives == 0 && game.contains(game.result, '_')) {
            return "---------------------------------------------------------------------\n" +
                    "Je hebt verloren! Het woord was " + new String(game.word) + ".";
        }
        return "---------------------------------------------------------------------\n" +
                "Je hebt gewonnen! Het geraden woord was " + new String(game.word) + ".";
    }
}
