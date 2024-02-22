package abstraction.one;

public abstract class P1 {
	int j;
	static int i = 10;
	abstract public void run();
	abstract public void sum();
	public void message() {
		System.out.println("hello world from message method of abstract class P1");
	}
	public static void main(String[] args) {
		System.out.println("hello world from main method of abstract class P1");
	}
	public P1(int j) {
		this.j = j;
		System.out.println("hello wolrd from constructor of abstract class P1");
	}
}
