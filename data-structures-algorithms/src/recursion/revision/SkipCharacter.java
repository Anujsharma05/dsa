package recursion.revision;

public class SkipCharacter {
    public static void main(String[] args) {
        String str = "baccad";
        char letter = 'a';
        String res = skip(str, letter);
        System.out.println(res);
    }
    static String skip(String str, char letter) {
        if(str.isEmpty()) {
            return str;
        }
        if(str.charAt(0) == letter) {
            return skip(str.substring(1), letter);
        } else {
            return str.charAt(0) + skip(str.substring(1), letter);
        }
    }
}
