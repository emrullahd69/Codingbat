package Logic_1;

public class alarmClock {
	/*
	 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a
	 * boolean indicating if we are on vacation, return a string of the form "7:00"
	 * indicating when the alarm clock should ring. Weekdays, the alarm should be
	 * "7:00" and on the weekend it should be "10:00". Unless we are on vacation --
	 * then on weekdays it should be "10:00" and weekends it should be "off".
	 * 
	 * 
	 * alarmClock(1, false) → "7:00" 
	 * alarmClock(5, false) → "7:00" 
	 * alarmClock(0,false) → "10:00"
	 * 
	 */
	//Alternative Solution-1
	public static void main(String[] args) {
		int day = 4;
		boolean isVacation = true;
//		if(isVacation) {
//			if(day==0 || day==6)
//				System.out.println("off");
//			else
//				System.out.println("10:00");
//		}else if(day==0 || day==6)
//			System.out.println("10:00");
//		else
//			System.out.println("7:00");

		//Alternative Solution-2 (Ternary)
		
		String result = (isVacation) ? (day==0 || day==6 ? "off" : "10:00"):
			                           (day==0 || day==6 ? "10:00" : "7:00");
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		System.out.println("first commit from remote repository");
		System.out.println("second commit from remote repository");

		System.out.println("third commit from local");

		
		
		System.out.println("third commit from remote repository");
		System.out.println("fourth commit from local master");
		System.out.println("fourth commit from remote Master");
		System.out.println("fifth commit from remote master");
		System.out.println("sixth commit from remote master");
		System.out.println("fifth commit from local master");

		
		System.out.println("local master commit");

		System.out.println("seventh commit from remote master");

	}
		
	}


