package ui;

public class Validator {
    public Boolean userInput(int userCoice, int size) {
        try {
            if (userCoice > 0 && userCoice <= size) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }
}
