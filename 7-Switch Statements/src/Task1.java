
public class Task1 {

	public static void main(String[] args) {
		char a = 'A';
		
		switch(a) {
		case 'A':
			System.out.println("Character is A");
			break;
		case 'B':
			System.out.println("Character is B");
			break;
		case 'C':
			System.out.println("Character is C");
			break;
		case 'D':
			System.out.println("Character is D");
			break;
		case 'E':
			System.out.println("Character is E");
			break;
		default:
			System.out.println("NOT A,B,C,D, or E");
			break;
		}
		
		
		// second way:
		switch(a) {
		case 'A': case 'B': case 'C': case 'D': case 'E':
			System.out.println(a + " is found");
			break;
		default:
			System.out.println("It is not found");
			break;
		}

	}

}
