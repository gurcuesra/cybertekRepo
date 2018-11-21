public class Assignment15 {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));    // 4 
		System.out.println(sumFirstAndLastDigit(257));    // 9 
		System.out.println(sumFirstAndLastDigit(0));      // 0 
		System.out.println(sumFirstAndLastDigit(5));      // 10 
		System.out.println(sumFirstAndLastDigit(-10));    // -1

	}
	
	public static int sumFirstAndLastDigit(int number) {
		int sum=0;
		double a= number;
		
		if(number<0) {
			return -1;
		}else {
			int lastDigit= number%10;
			while(a>=1) {
				a/=10;
			}
			
			sum = (int)(a*10) + lastDigit;
			return sum;
		}
	}

}
