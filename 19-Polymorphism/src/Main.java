
public class Main {

	public static void main(String[] args) {
		
		// Create 3 different object with 3 different reference and 3 different class
//		Dog d1 = new Dog();
//		d1.speak();
//		
//		Cat c1 = new Cat();
//		c1.speak();
//		
//		Bird b1 = new Bird();
//		b1.speak();
		
		// Create 3 different object with 1 reference and 3 different class
//		Animal a1 = new Dog();
//		a1.speak();
//		
//		Animal a2 = new Cat();
//		a2.speak();
//		
//		Animal a3 = new Bird();
//		a3.speak();
		
		
		// Create 1 object with 1 reference and 3 different class   -> POLYMORPHISM
		Animal a = new Dog();
		a.speak();
		
		a= new Cat();
		a.speak();
		
		a= new Bird();
		a.speak();

	}

}
