package string;

public class ImmutableString {

	public static void main(String[] args) {
		String s = "ja";
		String s1 = s + "va"; //another object is created as string object is immutable
		System.out.println(s1.toString());
		//same as
		System.out.println(s1);
		
		String s2 = s1 + "vaaa"; //another object is created as string object is immutable
		System.out.println(s2);
		
	}

}
