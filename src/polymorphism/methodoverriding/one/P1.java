package polymorphism.methodoverriding.one;

public class P1 {
	static int i = 10;
	int j = 20;
	String name = "muzamil";
	
	public static void staticMethod() {
		System.out.println("from static method of class p1 with address 100");
	}
	
	 void nonStaticMethod() {
		System.out.println("from non-static method of p1 with address 200");
	}
}
