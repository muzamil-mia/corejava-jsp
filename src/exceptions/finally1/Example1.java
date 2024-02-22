package exceptions.finally1;

public class Example1 {

	public static void main(String[] args) {
		try {
			int data = 25/5;
			System.out.println(data);
		}
		catch(NullPointerException obj) {
			System.out.println(obj);
		}
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}

}
