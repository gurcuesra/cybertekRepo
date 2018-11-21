import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int counter=1;
		
		while(counter<=10) {
			System.out.println("Enter your number #" + counter);
			boolean bool = scan.hasNextInt();
			if(bool) {
				counter++;
				int number = scan.nextInt();
				sum += number;
			}else {
				System.out.println("Invalid number");
			}
			scan.nextLine();		
		
		}
		System.out.println("Your total is: " + sum);
		scan.close();
		
		
		
		

	}
	

}
