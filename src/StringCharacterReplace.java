import java.util.List;
import java.util.Arrays;

public class StringCharacterReplace {

    /**
     * Class to replace specified characters in a string with other characters
     */

    private String replaceChars(char[] input, char actual, char[] replace) {
        int count = 0;
        int newLen = input.length;
        for (char c : input) {
            if (actual == c) count += replace.length;
        }
        newLen += count;
        char[] out = new char[newLen];
        for (int i = 0, j = 0; i < out.length; i++, j++) {
            if (actual == input[j]) {
                for (char c : replace) {
                    out[i] = c;
                    i++;
                }
            } else {
                out[i] = input[j];
            }
        }
        return String.valueOf(out);
    }

    public static void main(String[] args) {
        StringCharacterReplace obj = new StringCharacterReplace();
        System.out.println(obj.replaceChars("Dark Souls Remastered".toCharArray(), ' ', "%20".toCharArray()));
        System.out.println(obj.replaceChars("Dark Souls Remastered".toCharArray(), 'e', "EDGY".toCharArray()));
    }
}
