package string;

public class LowerUpper {

	public static void main(String[] args) {
		String str = "abcdefgh";
		String str1 = "";
		char ch = ' ';
		for(int i = 0; i < str.length(); i++) {
			if(i % 2 == 0) {
				ch = (char) (str.charAt(i) - 32);
				str1 = str1 + ch;
			}else {
				str1 = str1 + str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
