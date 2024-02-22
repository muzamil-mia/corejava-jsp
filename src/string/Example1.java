package string;

public class Example1 {

	public static void main(String[] args) {
		String str = "maam";
		String newStr = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			newStr = ch + newStr;
		}
		if(str.equals(newStr)) {
			System.out.println("given String is a palindrome string ");
		}else {
			System.out.println(newStr);
		}
	}

}
