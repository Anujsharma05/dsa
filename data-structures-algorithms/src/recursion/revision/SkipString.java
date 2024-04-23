package recursion.revision;

public class SkipString {
    public static void main(String[] args) {
        String str = "bccdappleabc";
        String skipLetter = "apple";
        String output = skip(str, skipLetter);
        System.out.println(output);
    }
    static String skip(String str, String skipStr) {
        if(str.isEmpty()) {
            return str;
        }
        if(str.startsWith(skipStr)) {
            return skip(str.substring(skipStr.length()), skipStr);
        } else {
            return str.charAt(0) + skip(str.substring(1), skipStr);
        }
    }
}
