package string;

public class Distinct {

	public static void main(String[] args) {
		String str = "javam";
		String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
				if(str.indexOf(ch) == str.lastIndexOf(ch) && str1.indexOf(ch) == -1) {
					str1 = str1 + ch;
			}
		}
		System.out.println(str1);
	}
}
