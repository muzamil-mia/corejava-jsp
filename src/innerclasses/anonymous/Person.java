package innerclasses.anonymous;

abstract public class Person {

	abstract void eat();
}

class TestAnonymousInner{
	public static void main(String[] args) {
		Person p = new Person() {

			@Override
			void eat() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
