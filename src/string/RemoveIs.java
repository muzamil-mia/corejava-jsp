package string;

public class RemoveIs {

	public static void main(String[] args) {

		String s = "whthisere this your houseis";
		String s3 = "this";
		String str1 = "";
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 't') && (s.charAt(i + 1) == 'h') && (s.charAt(i+2) == 'i') && (s.charAt(i+3) == 's')) {
				str1 = str1 + "  ";
				i=i + 3;
			} else {
				str1 = str1 + s.charAt(i);
			}
		}
		System.out.println(str1);

	}

}