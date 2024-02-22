package string;

public class DeleteTheString {

	public static void main(String[] args) {
		String str = "this is a class";
		String s2 = "is";
		int l = s2.length();
		
		while(str.contains(s2)) {
			int index = str.indexOf(s2);
			System.out.println(index);
			//System.out.println(str.substring(index + l));
			str = str.substring(0,index) + str.substring(index + l);
			System.out.println(str);
		}
		System.out.println(str);
	}

}
