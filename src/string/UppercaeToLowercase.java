package string;

public class UppercaeToLowercase {

	public static void main(String[] args) {
		String str = "HELLO";
		String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				str1 = str1 + (char) (ch - 'A' + 'a');
			}
		}
		System.out.println(str1);
	}

}
