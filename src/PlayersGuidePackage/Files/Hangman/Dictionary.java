package PlayersGuidePackage.Files.Hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Dictionary {
    List<String> words = new ArrayList<>();
    Random randomWord = new Random();

    public String getWord() {
        //can select random from File
        String word = words.get(randomWord.nextInt(words.size()));
        return word.toLowerCase();
    }
}
