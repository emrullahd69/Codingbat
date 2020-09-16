package warmup_1;

public class max1020 {

	public static void main(String[] args) {
		
		System.out.println(max1020(7,18));

	}

	public static int max1020(int a, int b) {
			  boolean a1= a>=10 && a<=20;
			  boolean b1 = b>=10 && b<=20;
			  if(a1 && !b1){
			    return a;
			  }else if(!a1 && b1){
			    return b;
			  }else if(a1 && b1){
			    return Math.max(a,b);
			  } else {
			    return 0;
			  }
			}
	}

