package polymorphism.methodoverloading.three;

public class OverloadingMain {
	public static void main(String[] args) {
		System.out.println("main is called");
		main(1,2);
	}
	
	public static void main(int a, int b) {
		System.out.println("user defined main is called " + (a + b));
	}
}
