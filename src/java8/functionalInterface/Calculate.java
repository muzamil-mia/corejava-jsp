package java8.functionalInterface;

@FunctionalInterface
public interface Calculate {
	
	//only one abstract method
	void calculating();
	
	//N default methods
	default void methodOne() {
		System.out.println("default method one from functional interface");
	}
	default void methodTwo() {
		System.out.println("default method one from functional interface");
	}
}
