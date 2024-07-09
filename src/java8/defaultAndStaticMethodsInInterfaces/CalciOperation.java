package java8.defaultAndStaticMethodsInInterfaces;

@FunctionalInterface
public interface CalciOperation {

	double operation(int a, int b);
	
	default void printInfo() {
		System.out.println("this is default method of functional interface");
	}
	
	static void typeOfOperation() {
		System.out.println("static content: arithematic operations");
	}
	
}
