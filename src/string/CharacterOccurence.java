package string;

public class CharacterOccurence {

	public static void main(String[] args) {
		String str = "parampara";
		char ch = 'a';
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + " is present " + count + " number of times");
	}

}
