package strings;

import java.io.*;

public class JumpGameVII {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/resources/stringtoolong.txt");
        String s = getFileContent(fis);
//        String s = "01101110";
        int minJump = 5, maxJump = 99998;
        boolean canReach = canReach(s, minJump, maxJump);
        System.out.println(canReach);
    }
    public static String getFileContent(FileInputStream fis) throws IOException
    {
        try( BufferedReader br =
                     new BufferedReader( new InputStreamReader(fis, "UTF-8" )))
        {
            StringBuilder sb = new StringBuilder();
            String line;
            while(( line = br.readLine()) != null ) {
                sb.append( line );
            }
            return sb.toString();
        }
    }
    public static boolean canReach(String s, int minJump, int maxJump) {
        int j=0;
        int len = s.length();
        if(s.charAt(len-1) != '0') return false;
        int i = 0;
        while(i < len && j < len) {
            j = Math.min(i+maxJump, len-1);
            boolean found = false;
            while(j >= i+minJump) {
                if(s.charAt(j) == '0') {
                    i = j;
                    found = true;
                    break;
                }
                j--;
            }
            if(i == len-1) return true;
            if(!found) return false;
        }
        return false;
    }
}
