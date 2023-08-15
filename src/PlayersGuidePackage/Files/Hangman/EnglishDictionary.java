package PlayersGuidePackage.Files.Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EnglishDictionary extends Dictionary {
    //imports file / enum with words, (later on) translation and meaning.

    public EnglishDictionary() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:/JavaProjects/Itvitae/com/desiree/PlayersGuide/untitled/src/PlayersGuidePackage/Files/Hangman/dictionary.txt"));

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            //Filters every word with a tab
            String[] wordArray = line.split("\t");
            for (String word : wordArray) {
                //Filters every word out which contains a -
                if (!word.contains("-")) {
                    words.add(word);
                }
            }
        }
    }

}
