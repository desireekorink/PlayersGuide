package PlayersGuidePackage.Files.Hangman;

public class Game {
    char[] word;
    char[] result;
    //Keeps track of remaining lives.
    int lives = 10;
    String incorrectGuesses = "";
    Player player;

    @Override
    public String toString() {
        return new String(result);
    }


    public void setWord(String word) {
        this.word = word.toCharArray();
        result = new char[word.length()];
        for (int index = 0; index < result.length; index++) {
            result[index] = '_';
        }
    }

    //Keeps track of Guesses
    public void Guess(char guessedLetter) {
        boolean isPresent = false;
        //Find and replace guessed letter in result array
        for (int index = 0; index < word.length; index++) {
            if (guessedLetter == word[index]) {
                result[index] = guessedLetter;
                isPresent = true;
            }
        }
        //Process incorrect guess
        if (!isPresent) {
            incorrectGuesses += guessedLetter;
            lives--;
            //Guessed Letter is already guessed
//            if (checkForDuplicates().containsKey(guessedLetter)) {
//                lives++;
//            }
        }
    }

//    public Map<Character, Integer> checkForDuplicates() {
//        Map<Character, Integer> map = new HashMap<>();
//        if (incorrectGuesses == null || incorrectGuesses.length() == 0) {
//            return map;
//        }
//        for (char ch : incorrectGuesses.toCharArray()) {
//            if (map.containsKey(ch)) {
//                int counter = map.get(ch);
//                map.put(ch, counter++);
//            } else {
//                map.put(ch, 1);
//            }
//        }
//        return map;
//    }

    public boolean isActive() {
        return lives > 0 && contains(result, '_');
    }

    public boolean contains(char[] arr, char ch) {
        for (char c : arr) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
}
