package string;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str = "hellow how are you";
		String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				str1 = str1 + str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
