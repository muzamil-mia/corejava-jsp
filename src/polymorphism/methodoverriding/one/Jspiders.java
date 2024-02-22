package polymorphism.methodoverriding.one;

public class Jspiders {

	public static void main(String[] args) {
			 
				 Animal animal = new Animal();
				 animal.speak();
				 System.out.println("**************");
				 
				 Cat cat  = new Cat();
				 cat.speak();
				 System.out.println("**************");
				 
				 Animal animal1 = new Cat();
				 animal1.speak();

	}

}
