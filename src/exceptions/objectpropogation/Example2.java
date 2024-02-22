package exceptions.objectpropogation;

public class Example2 {
	
	void m() {
		int data = 50/0;
	}
	
	void n() {
		m();
	}
	
	void p() {
		try {
			n();
		} catch(Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.p();
	}

}
