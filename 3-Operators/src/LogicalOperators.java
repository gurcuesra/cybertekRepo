
public class LogicalOperators {

	public static void main(String[] args) {
		char a1 = 'A';
		char a2 = 65;
		int i1=5;
		int i2=10;
		
		boolean res1=(i1==i2)&&(a1==a2);
		System.out.println(res1);        // -> false
		
		boolean res2 = (i1==i2)&(a1==a2);
		System.out.println(res2);        // -> false
		
		boolean res3 = (a1==a2)||(i1==i2);
		System.out.println(res3);        // -> true, because -> 'A' is equal to 65 as unicode

		boolean res4 = (a1==a2)|(i1==i2);
		System.out.println(res4);        // -> true, because -> 'A' is equal to 65 as unicode
		
		boolean res5 = (a1==a2)^(i1==i2);
		System.out.println(res5);        // -> true, because -> 'A' is equal to 65 as unicode
		
		boolean res6 = (a1==a2)^(i1!=i2);
		System.out.println(res6);        // -> false
	}

}
