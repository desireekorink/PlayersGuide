package PlayersGuidePackage.Files.Hangman;

public class Game {
    char[] word;
    char[] result;
    //Keeps track of remaining lives.
    int lives = 10;
    String incorrectGuesses = "";

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

        if (isAlreadyGuessed(guessedLetter)) {
            return;
        }

        // Check if present
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
        }
    }

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

    public boolean isAlreadyGuessed(char guessedLetter) {
        return (contains(incorrectGuesses.toCharArray(), guessedLetter) || contains(result, guessedLetter));
    }
}
