package polymorphism.finalkeyword;

public class GlobalInstanceVariable {
	final int i;
//	{
//		i = 10;
//	}
	GlobalInstanceVariable(int j) {
		//System.out.println(i);
		this.i = 100;
		System.out.println(i + " " + j);
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		GlobalInstanceVariable obj = new GlobalInstanceVariable(12);
	}
}
