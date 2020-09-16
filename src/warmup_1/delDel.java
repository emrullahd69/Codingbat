package warmup_1;

public class delDel {

	public static void main(String[] args) {
		
		System.out.println(delDel("a"));
		

	}

	public static String delDel(String str) {
		  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
			    // First char + rest of string starting at 4
			    return str.substring(0, 1) + str.substring(4);
			  }
			  // Otherwise return the original string.
			  return str;
			}
}
