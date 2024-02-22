package interfaces;

public interface I1 {
	int i=10;  //by default it is public static final variable
	public void walk();
	public void drink();
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println("hello again");
		System.out.println(i);
	}
}
