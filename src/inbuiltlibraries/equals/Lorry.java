package inbuiltlibraries.equals;

public class Lorry {
	int noOfWheels, noOfSeats;
	public Lorry(int noOfSeats, int noOfWheels) {
		this.noOfSeats = noOfSeats;
		this.noOfWheels = noOfWheels;
	}
	
	public boolean equals(Object obj) {
	    Bus bus1 = ((Bus)obj);
		return this.noOfWheels == bus1.noOfWheels && this.noOfSeats == bus1.noOfSeats; 
	}
}
