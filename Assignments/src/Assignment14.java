
public class Assignment14 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));   //->true
		System.out.println(isPalindrome(707));     //->true
		System.out.println(isPalindrome(11212));   //->false

	}
	
	public static boolean isPalindrome(int number) {
		int actualNumber=number;
		int reverse=0;
		int lastDigit=0;
		if(number<0) {
			number*=-1;
			
			while(number>0) {
				lastDigit=number%10;
				number/=10;
				reverse+=lastDigit;
				reverse*=10;
				if(number==0) {
					reverse/=10;
				}
			}
			
			reverse*=-1;
		}else {
			while(number>0) {
				lastDigit=number%10;
				number/=10;
				reverse+=lastDigit;
				reverse*=10;
				if(number==0) {
					reverse/=10;
				}
			}
		}
		
		
		if(reverse == actualNumber) {
			return true;
		}else {
			return false;
		}
		

	}

}
