package wrapperclasses;

public class Example1 {

	public static void main(String[] args) {
		int i = 42;
		Integer integerObj = new Integer(i);
		System.out.println(integerObj);
		Integer intobj = Integer.valueOf(i);

		Character charObj = new Character('c');
		boolean b = true;
		Boolean booleanObject = new Boolean(b);
		
		double d = 12.5;
		Double doubleObject = new Double(d);
		
		float f = 12.5f;
		Float floatObjject = new Float(f);
		
		byte bt = 12;
		
		Byte btObj = new Byte(bt);
		
		Long longObj = new Long(i);
		
		Integer a = new Integer(43);
		int j = a.intValue();

	}

}
