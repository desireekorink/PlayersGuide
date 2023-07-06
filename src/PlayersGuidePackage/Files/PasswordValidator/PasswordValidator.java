package PlayersGuidePackage.Files.PasswordValidator;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        //ophalen of password om te valideren
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter password:");
            String password = input.nextLine();
            //String password = "ABCDEFGH";
            //validator instantiëren
            PasswordValidator passwordValidator = new PasswordValidator();
            //met validator password controleren, en teruggeven wat het resultaat is
            ValidationResult result = passwordValidator.validate(password);
            //resultaat printen
            System.out.println(result.getMessage());
        }
    }

    private ValidationResult validate(String password) {
        if (password.length() < 6) {
            return new ValidationResult(false, "Password validation failed: is to short.");
        }
        if (password.length() > 13) {
            return new ValidationResult(false, "Password validation failed: is to long.");
        }
        if (!containsUpperCase(password)) {
            return new ValidationResult(false, "Password validation failed: does not contain a capital letter.");
        }
        if (!containsLowerCase(password)) {
            return new ValidationResult(false, "Password validation failed: does not contain a vowel or consonant.");
        }
        if (!containsDigit(password)) {
            return new ValidationResult(false, "Password validation failed: does not contain a digit.");
        }
        if (password.contains("T")) {
            return new ValidationResult(false, "Password validation failed: contains a 'T'.");
        }
        if (password.contains("&")) {
            return new ValidationResult(false, "Password validation failed: contains an '&'.");
        }
        return new ValidationResult(true, "Password validation successful.");
    }


    private boolean containsUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }

        }
        return false;
    }

    private boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }


}

class ValidationResult {
    private boolean isValid;
    private String message;

    public ValidationResult(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getMessage() {
        return message;
    }
}
/*
## Day 27 Challenge: The Password Validator
The fifth and final pedestal describes a class that represents a concept more abstract than the first four:
a password validator. You must create a class that can determine if a password is valid
(meets the rules defined for a legitimate password).
The pedestal initially doesn’t describe any rules,but as you brush the dust off the pedestal, it vibrates for a moment, and the
following rules appear:
- Passwords must be at least 6 letters long and no more than 13 letters long.
- Passwords must contain at least one uppercase letter, one lowercase letter, and one number.
- Passwords cannot contain a capital T or an ampersand (&) because Ingelmar in IT has decreed it.
That last rule seems random, and you wonder if the pedestal is just tormenting you with obscure rules.

You ponder for a moment about how to decide if a character is uppercase, lowercase, or a number,
but while scratching your head, you notice a piece of folded parchment on the ground near your feet.
You pick it up, unfold it, and read it:
foreach with a string lets you get its characters!
for (char ch: word.toCharArray()) { if (Character.isUpperCase(ch)) }

Character has static methods to categorize letters! char.isUpperCase('A'),char.isLowerCase('a'), char.isDigit('0')

That might be useful information! You are grateful to whoever left it behind. It is signed simply “A.”

**Objectives**:
- Define a new PasswordValidator class that can be given a password and determine if the password follows the rules above.
- Make your main method loop forever, asking for a password and reporting whether the password is allowed using an instance of the Password Validator class.
 */
