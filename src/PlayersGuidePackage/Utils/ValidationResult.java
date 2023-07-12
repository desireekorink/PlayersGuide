package PlayersGuidePackage.Utils;

public class ValidationResult {
    private boolean isValid;
    private static String message;

    public ValidationResult(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public static String getMessage() {
        return message;
    }
}
