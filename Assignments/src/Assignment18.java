import java.util.Arrays;
import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortIntegers()));
   
		
	}
	
	public static int[] getIntegers(int number) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number #" + number);
		int[] array = new int[number];
		
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		return array;
		
	}
	
	public static int[] printArray() {
		int[] arr = getIntegers(5);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		return arr;
	}
	
	public static int[] sortIntegers() {
		int[] a = printArray();
		
		int[] b = new int[a.length];
		int min,max;
		min=max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		
		b[0]=max;
		b[a.length-1]=min;
		
		for(int p=0; p<a.length; p++) {
			if(a[p]<max) {
				if(p<a.length-1) {
					b[p++]=a[p];
				}		
			}
		}
			
		return b;
		
	}

}
