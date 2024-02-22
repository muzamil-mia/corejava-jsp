package polymorphism.methodoverriding.one;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 obj = new P1();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.name);
		obj.staticMethod();
		obj.nonStaticMethod();
		System.out.println("*******");
		P2 obj1 = new P2();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj1.name);
		obj1.staticMethod();
		obj1.nonStaticMethod();   //run time bidening
		System.out.println("******");
		P1 obj3 = new P2();
		System.out.println(obj3.i);
		System.out.println(obj3.j);
		System.out.println(obj3.name);  //compile time bidening
		obj3.staticMethod();
		obj3.nonStaticMethod();         // run time bidening
	}
}
