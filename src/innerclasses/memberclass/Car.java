package innerclasses.memberclass;

public class Car {
	// outer class members and methods
	private String model;

	public Car(String model) {
		this.model = model;
	}

	private class Engine {
		private int horsepower;

		Engine(int horsepower) {
			this.horsepower = horsepower;
		}

		public void start() {
			System.out.println("engine starts" + " model is " + model);
		}
	}
	//method to access inner class
	public void start() {
		Engine engine = new Engine(120);
		engine.start();
	}

	public static void main(String[] args) {
		Car car = new Car("bmw");
		car.start();
	}
}