package interfaces;

 public class C1 extends C2 implements I2 {
	public static void main(String[] args) {
		System.out.println("main called");
		C2 obj = new C1();
		obj.walk();
		obj.drink();
		obj.run();
		obj.sum();
	}
}
