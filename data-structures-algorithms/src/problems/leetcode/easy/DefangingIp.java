package problems.leetcode.easy;

public class DefangingIp {

	public static void main(String[] args) {
		
		String address = "255.100.50.0";
		String defanged = defangIPaddr(address);
		System.err.println(defanged);

	}
	public static String defangIPaddr(String address) {
        
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<address.length(); i++) {
//			if(address.charAt(i) == '.') {
//				sb.append("[.]");
//			} else {
//				sb.append(address.charAt(i));
//			}
//		}
//		return sb.toString();
		
		return address.replace(".", "[.]");
    }
}
