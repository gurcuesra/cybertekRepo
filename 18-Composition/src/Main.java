
public class Main {

	public static void main(String[] args) {
		// Engine e1 = new Engine();
		// Honda h1 = new Honda("Red", 200, e1);          //-> First way:
		Honda h1 = new Honda("Red", 200, new Engine());   //-> Second way;
		h1.carInfo();
		h1.startHonda();

	}

}
