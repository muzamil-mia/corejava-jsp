package abstraction.two;

public class ATM extends SBI {
	public void bank() {
		System.out.println("this bank is SBI bank");
	}
	
	public void withdraw() {
		System.out.println("withdrawing from ATM");
	}
	public void deposit() {
		System.out.println("depositing from atm");
	}
}
