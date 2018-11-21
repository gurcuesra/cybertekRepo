import java.util.Scanner;

public class Assignment19 {

	public static void main(String[] args) {
		
		System.out.println("Minimum number is: "+findMin(readIntegers(5)));

	}
	
	public static int[] readIntegers(int count){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter "+count+" number");
		int[] array = new int[count];
		
		for(int i=0; i< array.length; i++) {
			array[i]=scan.nextInt();
		}
		
		scan.close();
		return array;
	}
	
	public static int findMin(int[] arr) {
		int min=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		return min;
	}
}
