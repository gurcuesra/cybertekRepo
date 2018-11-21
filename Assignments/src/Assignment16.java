
public class Assignment16 {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789)); // 20 
		System.out.println(getEvenDigitSum(252));       // 4 
		System.out.println(getEvenDigitSum(-22));       // -1 

	}
	
	public static int getEvenDigitSum(int number) {
		if(number<0) {
			return -1;
		}else {
			int sum=0;
			int lastDigit;
			
			while(number>0) {
				lastDigit = number%10;
				number/=10;
				if(lastDigit%2==0) {
					sum+=lastDigit;
				}
			}
			
			return sum;
			
		}
	}

}
