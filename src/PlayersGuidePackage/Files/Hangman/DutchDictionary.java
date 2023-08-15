package PlayersGuidePackage.Files.Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DutchDictionary extends Dictionary {
    public DutchDictionary() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Files/Hangman/woordenboek.txt"));

        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            //Filters every word out which contains an - or ' or Uppercase
            if (!word.contains("-") && !word.contains("'") && !hasUppercase(word)) {
                words.add(word);
            }
        }
    }

    private boolean hasUppercase(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
