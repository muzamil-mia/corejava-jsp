package interfaces.abstraction;

public class User {
static int i = 10;
static {
	i = 20;
}
	public static void main(String[] args) {
		Bank bank = new Bank();
		ATM obj = bank.atm();
		obj.withdraw();
		System.out.println(i);
	}

}
