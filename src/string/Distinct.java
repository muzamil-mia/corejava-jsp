package string;

public class Distinct {

	public static void main(String[] args) {
		String str = "alphaadida";
		String str1 = "";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
				if(str.indexOf(ch) == str.lastIndexOf(ch) && str1.indexOf(ch) == -1) {
					count++;
			}
		}
		System.out.println(count);
	}
}
