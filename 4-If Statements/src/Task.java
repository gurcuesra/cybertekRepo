
public class Task {

	public static void main(String[] args) {
		int marks = 95;
		if(marks<60 && marks>=0) {
			System.out.println("Fail");
		}else if(marks>=60 && marks<90) {
			System.out.println("Pass");
		}else if(marks>=90 && marks<=100) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("Please write mark between 0 and 100");
		}
	}

}
