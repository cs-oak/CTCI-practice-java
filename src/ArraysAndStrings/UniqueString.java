package ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a given string has all unique characters
 */

public class UniqueString {

    private boolean isUnique(String str) {
        Set uniqueSet = new HashSet();

        for (int i = 0; i < str.length(); i++) {
            if (!uniqueSet.contains(str.charAt(i))) {
                uniqueSet.add(str.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }

    private void printUnqiue(boolean isUnique) {
        System.out.println(isUnique ? "Unique!" : "Not Unique!");
    }

    public static void main(String[] args) {
        UniqueString obj = new UniqueString();
        final String UNIQUE = "python";
        final String NOT_UNIQUE = "java";

        obj.printUnqiue(obj.isUnique(UNIQUE));
        obj.printUnqiue(obj.isUnique(NOT_UNIQUE));
    }

}