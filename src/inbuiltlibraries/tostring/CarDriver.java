package inbuiltlibraries.tostring;

public class CarDriver {

	public static void main(String[] args) {
		Car car = new Car("honda", 2000000, 280);
		System.out.println(car.toString());
		System.out.println(car); 
		System.out.println();
	}

}
