package PlayersGuidePackage.Files.Hangman;

public abstract class Report {
    public Report(Game game) {
        this.game = game;
    }

    Game game;

    //show status
    public abstract String showReport();

    public abstract String showEnd();
    //show end
}
