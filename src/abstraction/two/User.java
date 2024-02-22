package abstraction.two;

public class User {

	public static void main(String[] args) {
		Bank atm = new ATM();
		atm.withdraw();
		atm.deposit();
		atm.bank();
	}

}
