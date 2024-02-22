package interfaces.multipleinheritance;

public class User implements Printable, Showble {
	
	public void print() {
		System.out.println("hello");
	}
	
	public void show() {
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		User obj = new User();
		obj.show();
		obj.print();
	}
}
