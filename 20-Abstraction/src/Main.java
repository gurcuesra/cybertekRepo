
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		
		/*Output:
		 * Breathe in, breathe out
		 * Yorkie is eating
		 */
		
		Parrot p1 = new Parrot("Australia Ringneck");
		p1.breathe();
		p1.eat();
		p1.fly();
		
		/*Output:
		 * Breathe in, breathe out
		 * Australia Ringneck is pecking
		 * Flitting from branch to branch
		 */

	}

}
