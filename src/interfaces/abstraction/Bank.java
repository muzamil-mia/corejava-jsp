package interfaces.abstraction;

public class Bank {
	private class SBI implements ATM {
		public void withdraw() {
			System.out.println("withdaw money");
		}
		
		public void checkBalance() {
			System.out.println("checking balance");
		}
	}
	public ATM atm() {
		// TODO Auto-generated method stub
		return new SBI();
	}
}
