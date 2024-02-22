package string;

public class FindingDifferentCharacters {

	public static void main(String[] args) {
		String str = "java@10";
		int digits = 0, characters = 0, specialCharacters = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				characters++;
			}else if(ch >= '0' && ch <= '9') {
				digits++;
			}else {
				specialCharacters++;
			}
		}
		System.out.println(digits + " " + characters + " " + specialCharacters);
	}
}
