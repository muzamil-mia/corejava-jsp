package innerclasses.memberclass;

public class Nested_Inner_Class {
	private int outerVariable = 10;
	private static int staticInnerVariable = 20;
	//static inner class
	static class StaticInnerClass {
		//can access only static members of outer class
		private static int staticInnerVariable = 15;
		public void useStaticInnerClass() {
			System.out.println(staticInnerVariable);
			Nested_Inner_Class obj = new Nested_Inner_Class();
			System.out.println(obj.staticInnerVariable);
		}
	}
	
	//inner class
	class InnerClass {
		//can access both static as well as non static members of outer class
		private void printOuterVariable() {
			System.out.println("Outer Variable: " + outerVariable);
			System.out.println(staticInnerVariable);
		}
	}
	
	public void useInnerClass() {
		InnerClass inner = new InnerClass();
		inner.printOuterVariable();
	}
	public static void main(String[] args) {
		//creating instance of StaticInnerClass
		StaticInnerClass inner = new StaticInnerClass();
		inner.useStaticInnerClass();
	
		Nested_Inner_Class obj = new Nested_Inner_Class();
		obj.useInnerClass();
	}
}
