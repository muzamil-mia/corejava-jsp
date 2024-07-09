package java8.defaultAndStaticMethodsInInterfaces;

public interface InterfaceOne {
	void printNames();
	void getNames();
	
	default void defaultMethodOne() {
		System.out.println("default method one from interface one");
	}
	
	default void defaultMethodTwo() {
		System.out.println("default method two from interface one");
	}
	default void sameMethod() {
		System.out.println("same method from interface one");
	}
}
