package polymorphism.methodoverriding.one;

public class P2 extends P1 {
	static int i = 30;
	int j = 40;
	String name = "sabit";
	public static void staticMethod() {
		System.out.println("from non static method of p2 class with address 300");
	}
	public void nonStaticMethod() {
		System.out.println("from non static method of p2 class with address 400") ;
	}
}
