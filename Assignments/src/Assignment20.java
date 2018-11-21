import java.util.Arrays;

public class Assignment20 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));  // -> [1,2,3,4,5]
		reverse(arr);                              // -> [5,4,3,2,1]

	}
	
	public static void reverse(int[] array) {
		int[] a = new int[array.length];
		int counter=0;
		for(int i=array.length-1; i>=0; i--) {
			a[counter]=array[i];
			counter++;
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
