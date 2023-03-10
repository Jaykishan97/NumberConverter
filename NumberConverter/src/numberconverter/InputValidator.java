// InputValidator.java

package numberconverter;

public class InputValidator {
    public static boolean isDecimalNumber(String input) {
        try {
            int number = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
