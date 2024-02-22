package string;

public class MethodsofStringClass {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "HELLO";
		
		// 1: length() method : returns integer
		//fully qualified --> java.lang.String.length() : 
		System.out.println(s.length());
		
		// 2: toUpperCase() : returns String
		// fully qualified name --> java.lang.String.toUpperCase()
		System.out.println(s.toUpperCase());
		
		// 3: toLowerrCase() : returns String
		// fully qualified name --> java.lang.String.toLowerCase()
		System.out.println(s.toLowerCase());

		// 4: equalsIgnoreCase() method : returns boolean
		// fully qualified name --> java.lanag.String.equalsIgnoreCase()
		System.out.println(s.equalsIgnoreCase(s1));
		
		// 5: concat() method : returns String
		// fully qualified name --> java.lanag.String.concat()
		System.out.println(s.concat(" ").concat(s1));
		
		// 6: charAt() method: returns char
		// fully qualified name --> java.lang.String.charAt()
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length() - 1));
		
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
	}

}
