
public class StaticMethods {

	public static void main(String[] args) {
		Abc.show1();
		Abc.show4();
		
		Abc x = new Abc();
		x.show2();
		x.show3();
			
	}

}

class Abc{
	public static void show1() {     // -> static method
		System.out.println("hi");
		//show2();
		show4();
	}
	
	public void show2() {            // -> instance method
		System.out.println("hi");
		show1();
	}
	
	public void show3() {
		System.out.println("hi");
		show2();
		show1();
	}
	
	public static void show4() {
		System.out.println("hi");
	}
}
