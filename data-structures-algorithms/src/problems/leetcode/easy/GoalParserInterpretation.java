package problems.leetcode.easy;

public class GoalParserInterpretation {

	public static void main(String[] args) {
		String command = "(al)G(al)()()G";
		String output = interpret(command);
		System.err.println(output);

	}
	public static String interpret(String command) {
        
//		String out = "";
//		out = command.replace("(al)", "al");
//		out = out.replace("()", "o");
//		return out;
		
		return command.replace("()", "o").replace("(al)", "al");
    }
	
	public static String interpretUsingStrBuilder(String command) {
		return null;
	}
}
