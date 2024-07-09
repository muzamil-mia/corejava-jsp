package java8.defaultAndStaticMethodsInInterfaces;

public interface InterfaceTwo {
	default void break1() {
		System.out.println("its break time");
	}
	default void sameMethod() {
		System.out.println("same method from interface two");
	}
}
