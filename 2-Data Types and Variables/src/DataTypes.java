
public class DataTypes {

	public static void main(String[] args) {
		// byte
		byte b1 = 25;
		byte b2 = -128;
		byte b3 = 127;
		System.out.println(b1+ "|"+b2+"|"+b3);
		//byte b4 = 128;
		
		System.out.println("----------------------");
		
		// short
		short s1=500;
		short s2=-32768;
		short s3=32767;
		//short s4=32768;
		System.out.println(s1+ "|"+s2+"|"+s3);
		
		System.out.println("----------------------");
		
		
		// int
		int i1=-50000;
		int i2=100_000;
		int i3=50000;
		System.out.println(i1+ "|"+i2+"|"+i3);
		
		System.out.println("----------------------");
		
		// long
		long l1=100_000_000;
		long l2=2147839494031L;
		System.out.println(l1+ "|"+l2);
		
		System.out.println("----------------------");
		
		// float: floating point types have double as default type
		float f1=5.2f;
		double d1=5.2;
		System.out.println(f1+ "|"+d1);
		
		System.out.println("----------------------");
		
		// boolean
		boolean bool=true;
		boolean bool2=false;
		System.out.println(bool+ "|"+bool2);
		
		System.out.println("----------------------");
		
		// char
		char c1='D';
		char c2='2';
		char c3='@';
		char c4='\u00A9';
		System.out.println(c1+ "|"+c2+"|"+c3);
		System.out.println(c4);
		
		System.out.println("----------------------");
		
		
		
		

	}

}
