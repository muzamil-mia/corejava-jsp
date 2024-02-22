package string;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			str1 = ch + str1;
		}
		System.out.println(str1);
		if(str.equals(str1)) {
			System.out.println("palindrome string");
		}else {
			System.out.println("not a plaindrome string");
		}
	}

}
