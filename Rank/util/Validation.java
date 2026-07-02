package util;

public class Validation {
    public static boolean isValidMark(int mark) {

        if (mark >= 0 && mark <= 100) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValidRollNo(int rollNo) {

        if (rollNo > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidName(String name) {

        if (name != null && !name.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}