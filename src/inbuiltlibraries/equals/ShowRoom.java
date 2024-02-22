package inbuiltlibraries.equals;

public class ShowRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("tata", "black");
		Car car2 = new Car("tata","black");
		System.out.println(car1.equals(car2));
	}

}
