package string;

public class FirstClass {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "hello";
		System.out.println(s == s1);
		
		String s2 = new String("java");
		String s3 = new String("java");
		System.out.println(s2 == s3);
	}

}
