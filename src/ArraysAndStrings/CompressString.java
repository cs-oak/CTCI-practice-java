package ArraysAndStrings;

public class CompressString {

    /**
     * Class to compress given string
     */

    private String compressString(String input){
        StringBuilder out = new StringBuilder();
        int count = 1;
        char prev = input.charAt(0);

        for (int i =1; i < input.length(); i++) {

            if(input.charAt(i) == prev) {
                count++;
            } else {
                out.append(prev);
                out.append(count);
                prev = input.charAt(i);
                count = 1;
            }
        }

        out.append(prev);
        out.append(count);

        String output = out.toString();
        return (output.length() >= input.length()) ? input : output;
    }

    public static void main(String[] args) {
        CompressString obj = new CompressString();
        System.out.println(obj.compressString("aaabcccccaaa"));
        System.out.println(obj.compressString("aabb"));
        System.out.println(obj.compressString("Skyrim"));
    }
}
