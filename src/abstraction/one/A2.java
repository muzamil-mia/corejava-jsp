package abstraction.one;

public class A2 extends A1 {
	public A2(int j) {
		super(j);
	}
	
	public void login() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new A2(10);

	}

}
