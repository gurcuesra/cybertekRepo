public class Assignment10 {

	public static void main(String[] args) {
		printYearsAndDays(525600);   //= > "525600 min = 1 y and 0 d"
		printYearsAndDays(1051200);  //= > "1051200 min = 2 y and 0 d"
		printYearsAndDays(561600);   //= > "561600 min = 1 y and 25 d"
	}
	
	public static void printYearsAndDays(long min) {
		if(min<0) {
			System.out.println("Invalid value");
		}else {
			long hour = min/60;
			long day = hour/24;
			long year = day/365;
			long remainDay = day%365;
			
			System.out.println(min + " min = " + year +"y and " + remainDay +"d");
		}
		
	}

}
