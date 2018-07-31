import java.util.Arrays;

public class StringPermutation {

    private boolean isPermutation(String a, String b) {
        return sortString(a).equals(sortString(b));
    }

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
