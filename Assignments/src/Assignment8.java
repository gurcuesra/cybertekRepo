
public class Assignment8 {

	public static void main(String[] args) {
		System.out.println(getDurationString(75,12));  //-> 1h 15m 12s
		System.out.println(getDurationString(3661));   //-> 1h 1m 1s
		System.out.println(getDurationString(-75,12)); //-> Invalid Value
		System.out.println(getDurationString(-12));    //-> Invalid Value

	}
	
	public static String getDurationString(int min, int sec) {
		if((min<0) || (sec<0 && sec>59)) {
			return "Invalid Value";
		}else {
			if(min>59) {
				int hour = min/60;
				int remain = min%60;
				return hour + "h " + remain+"m "+sec +"s";
			}else {
				return "0h "+ min +"m "+ sec+"s";
						
			}
			
		}
	}
	
	public static String getDurationString(int sec) {
		if(sec<0) {
			return "Invalid Value";
		}else {
			if(sec>59) {
				int calcMin = sec/60;
				int remSec = sec%60;
				return getDurationString(calcMin,remSec);
			}else {
				return getDurationString(0,sec);
			}
			
		}
	}

}

