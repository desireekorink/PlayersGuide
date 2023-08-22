package PlayersGuidePackage.Files.Hangman;

import java.io.FileNotFoundException;

public class Hangman {
    Dictionary dictionary;
    Report report;


    public void setLanguageToPlayerChoice(Game game, Language language) throws FileNotFoundException {
        if (language == Language.NEDERLANDS) {
            dictionary = new DutchDictionary();
            report = new DutchReport(game);
        } else if (language == Language.ENGLISH) {
            dictionary = new EnglishDictionary();
            report = new EnglishReport(game);
        }
    }

    public Language getLanguageFromPlayer(Player player) {
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

    public boolean getChoiceFromPlayer(Player player) {
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

