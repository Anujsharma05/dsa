package recursion.subsetstring;

public class SkipString {
    public static void main(String[] args) {
        String str = "bccdappleabc";
        String skipLetter = "apple";
        String output = skip(str, skipLetter);
        System.out.println(output);
    }
    private static String skip(String str, String skipLetter) {
        if(str.isEmpty()) return "";
        if(str.startsWith(skipLetter)) {
            return skip(str.substring(skipLetter.length()), skipLetter);
        } else {
            return str.charAt(0) + skip(str.substring(1), skipLetter);
        }
    }
}
