package inbuiltlibraries.equals;

public class Bus {
	int noOfWheels, noOfSeats;
	public Bus(int noOfSeats, int noOfWheels) {
		this.noOfSeats = noOfSeats;
		this.noOfWheels = noOfWheels;
	}
	public boolean equals(Object obj) {
		Lorry lorry = ((Lorry)obj);
		return this.noOfWheels == lorry.noOfWheels && this.noOfSeats == lorry.noOfSeats;
	}
}
