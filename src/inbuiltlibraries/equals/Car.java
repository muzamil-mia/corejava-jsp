package inbuiltlibraries.equals;

public class Car {
	String color;
	String brandName;
	public Car(String color, String brandName) {
		this.brandName = brandName;
		this.color= color;
	}
	
	public boolean equals(Object obj) {
		Car temp = (Car)obj;
		return this.brandName == temp.brandName && this.color == temp.color;
		//return this.brandName = obj.brandName;
	}
}
