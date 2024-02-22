package string;

public class VowelsCount {

	public static void main(String[] args) {
		String str = "parampara";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': 
				count++;
			}
		}
		System.out.println(count);
	}

}
