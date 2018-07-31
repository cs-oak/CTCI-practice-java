import java.util.Arrays;

/**
 * Implement an algorithm to check if a string is a permutation of another
 */
public class StringPermutation {

    /**
     * Sort the strings and check if they're the same
     * @param a
     * @param b
     * @return
     */
    private boolean isPermutation(String a, String b) {
        return sortString(a).equals(sortString(b));
    }

    /**
     * Simple method to sort a String
     * @param str
     * @return
     */
    private String sortString(String str) {
       char[] sort = str.toCharArray();
        Arrays.sort(sort);
        return String.valueOf(sort);
    }

    public static void main(String[] args) {
        StringPermutation obj = new StringPermutation();
        final String one = "oldwestaction";
        final String two = "clinteastwood";

        System.out.println(obj.isPermutation(one,two) ? "Yes!" : "No!");
    }
}
