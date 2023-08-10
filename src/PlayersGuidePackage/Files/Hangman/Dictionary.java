package PlayersGuidePackage.Files.Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Dictionary {
    //imports file / enum with words, (later on) translation and meaning.
    List<String> words = new ArrayList<>();
    Random randomWord = new Random();

    public Dictionary() throws FileNotFoundException {
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

    //Needs to send out word to the main game.
    public String getWord() {
        //can select random from File
        String word = words.get(randomWord.nextInt(words.size()));
        return word.toLowerCase();
    }


}
