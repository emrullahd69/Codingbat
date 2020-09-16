package Logic_1;

public class sumLimit {
	/*
	 * 
	 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has
	 * the same number of digits as a. If the sum has more digits than a, just
	 * return a without b. (Note: one way to compute the number of digits of a
	 * non-negative int n is to convert it to a string with String.valueOf(n) and
	 * then check the length of the string.)
	 * 
	 * 
	 * sumLimit(2, 3) → 5 sumLimit(8, 3) → 8 sumLimit(8, 1) → 9
	 */
	
	public static void main(String[] args) {
	
		sumLimit obj = new sumLimit();  
		
		System.out.println(obj.sumLimit(11,5));
	}

	public int sumLimit(int a, int b) {
		  int sum = a+b;
		  String sum1 = String.valueOf(sum);
		  String a1 = String.valueOf(a); 
		  if(sum1.length()>a1.length()){
		    return a;
		  }return a+b;
		}

	
}
