package ArraysAndStrings;

public class StringRotation {

    /**
     * Class to check if a given string is a rotation of a
     * reference string by calling isSubstring method
     */

    private boolean isSubstring(String first, String second) {
        return second.contains(first) || first.contains(second);
    }

    private boolean isRotation(String input, String reference) {
        String str;
        if (input.length() != reference.length()) {
            return false;
        } else {
            str = input + input;
            return isSubstring(str, reference);
        }
    }

    public static void main(String[] args) {
        StringRotation obj = new StringRotation();
        System.out.println(obj.isRotation("erbottlewat", "waterbottle"));
        System.out.println(obj.isRotation("clinteastwood", "woodclinteast"));
        System.out.println(obj.isRotation("clinteastwood", "oldwestaction"));
        System.out.println(obj.isRotation("dark souls", "i cannot parry"));
    }
}
