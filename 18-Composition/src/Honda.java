
public class Honda extends Car{
	
	
	private Engine engine;     // -> HAS-A realtionship -> Class is a reference data type.
	
	
	public Honda(String color, int maxSpeed, Engine engine) {
		super(color, maxSpeed);
		this.engine = engine;
	}
	
	public void startHonda() {
		engine.start();     // -> It is calling the start method from Engine class with "engine" parameter.
	}
	
}
