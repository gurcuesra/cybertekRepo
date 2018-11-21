 
public class Assignment21_A {
	public String str;
	public double val;
	
	public Assignment21_A() {
		str = "JAVA";
		val = 0;
	}
	
	public Assignment21_A(String str) {
		this.str=str;
		val = 0;
	}
	
	public Assignment21_A(double val) {
		this.val=val;
		str = "JAVA";
	}
	
	public Assignment21_A(String str, double val) {
		this.str = str;
		this.val = val;
	}
	
	public void print() {
		System.out.println("str: " + str + " ,val: " + val);
	}
}
