package inbuiltlibraries.tostring;

public class Car {
	String brandName;
	int price;
	double topSpeed;
	
	public Car(String brandName, int price, double topSpeed) {
		this.brandName = brandName;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	
	//method similar to toString() method
	
	
	//overriding the Object class toString() in car subclass
	public String toString() {
		return "Brand Name: " + this.brandName + " price: " + this.price + " Top Speed: " + this.topSpeed;
	}
}
