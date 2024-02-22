package string;

public class Duplicates {

	public static void main(String[] args) {
		String str = "javam";
		String newStr = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for(int j = i + 1; j < str.length(); j++) {
				if(ch == str.charAt(j) && newStr.indexOf(ch) == -1) {
					newStr = newStr + ch;
					break;
				}
			}
		}
		System.out.println(newStr);
	}

}
