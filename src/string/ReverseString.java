package string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "hello";
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			str1 = ch + str1;
		}
		System.out.println(str1);
	}

}
