import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = scanner.nextInt();
		
		int min,max;
		min=max=a;
		
		while(true) {

			a = scanner.nextInt();
			
			if(a<min) {
				min=a;
			}
			
			if(a>max) {
				max=a;
			}
			
			boolean b = scanner.hasNextInt();
			
			if(b==false) {
				break;
			}
		}
		
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		scanner.close();
	}

}
