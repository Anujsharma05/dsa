package recursion;

public class ReverseString {

	public static void main(String[] args) {
		
		ReverseString obj = new ReverseString();
		String output = obj.reverse(null);
		System.err.println(output);
	}

	public String reverse(String str)
    {
		if(str==null) {
			return null;
		}
		if(str.isEmpty()) {
			return str;
		}
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
