
public class Assignment21 {

	public static void main(String[] args) {
		Assignment21_A a1 = new Assignment21_A();
		a1.print();
		
		Assignment21_A a2 = new Assignment21_A("test");
		a2.print();
		
		Assignment21_A a3 = new Assignment21_A(9876.000873);
		a3.print();
		
		Assignment21_A a4 = new Assignment21_A("test",5.6);
		a4.print();
		
		

	}

}

/*
 * str: JAVA, val: 0.0 
 * str: test, val: 0.0
 * str: JAVA, val: 9876.000873 
 * str: test, val: 5.6
 */