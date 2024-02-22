package interfaces.three;

public class BankUser {
	public static void main(String[] args) {
		Bank sbi = new SBI();
		float interest = sbi.getRateOfInterest();
		System.out.println(interest);
	}
}
