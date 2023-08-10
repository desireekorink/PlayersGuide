package PlayersGuidePackage.Files.Hangman;

public class Report {
    char[] word;
    char[] result;
    //Keeps track of remaining lives.
    int lives = 10;
    String incorrectGuesses = "";

    @Override
    public String toString() {
        return new String(result);
    }

    public Report(String word) {
        this.word = word.toCharArray();
        result = new char[word.length()];
        for (int index = 0; index < result.length; index++) {
            result[index] = '_';
        }
    }

    //Keeps track of result (= rightly guessed letters)
    public String showReport() {
        return "---------------------------------------------------------------------\n" +
                "Word: " + new String(result) + " | Remaining Lives: " + lives + " | Incorrect Guesses: " + incorrectGuesses + " | Guess: ";

    }

    //Keeps track of Guesses
    public void Guess(char guessedLetter) {
        boolean correct = false;
        for (int index = 0; index < word.length; index++) {
            if (guessedLetter == word[index]) {
                result[index] = guessedLetter;
                correct = true;
            }
        }
        if (!correct) {
            incorrectGuesses += guessedLetter;
            lives--;
        }

    }


}
