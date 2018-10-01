package ArraysAndStrings;

public class ReverseString {

    /**
     * Implement an algorithm to reverse a string
     */

    private String reverseString(String input) {
        char[] str = input.toCharArray();
        int len = input.length() - 1;
        char temp;
        for (int i = 0; i <= len/2; i++) {
            temp = str[i];
            str[i] = str[len - i];
            str[len - i] = temp;
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        System.out.println(obj.reverseString("gnalog"));
        System.out.println(obj.reverseString("12345"));
    }
}
