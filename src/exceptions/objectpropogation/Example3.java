package exceptions.objectpropogation;

public class Example3 {

	void m() {
		//throw new java.io.IOException("device error"); //checked exception
	}
	
	void n() {
		m();
	}
	
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("exception handled");
		}
	}
	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.p();
	}

}
