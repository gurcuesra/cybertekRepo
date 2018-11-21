
public class CalculateInterest {

	public static void main(String[] args) {
		
		System.out.println(calculateInterest(10000, 2));
		System.out.println(calculateInterest(10000, 3));
		System.out.println(calculateInterest(10000, 4));
		System.out.println(calculateInterest(10000, 5));
		
		System.out.println("--------------------------------");
		
		
		
		
		for(int i=2; i<=5; i++) {
			System.out.println(calculateInterest(10000, i));
		}
		
		
		

	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return amount * (interestRate/100);
	}

}
