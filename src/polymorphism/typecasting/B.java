package polymorphism.typecasting;

public class B extends A {

	public static void main(String[] args) {
		//B obj =  new A(); type mismatch cannot convert B to A type
		B obj =(B) new A();// compiles successfully but ClassCastException is thrown at runtime
	      System.out.println("hello");
	}

}
