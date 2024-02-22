package string;

public class CharacterPresent {

	public static void main(String[] args) {
		String str = "helloa";
		char ch = 'a';
		boolean present = false;
		for(int i = 0; i < str.length(); i++) {
			if(ch == str.charAt(i)) {
				present = true;
				break;
			}
		}
		if(present) {
			System.out.println("character is present");
		}else {
			System.out.println("character is not present");
		}
	}

}
