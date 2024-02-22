package polymorphism.finalkeyword;

public class GlobalFinalStaticVariable {
	
	//final static int i = 10;
	final static int i;
	int j = 20;
	static int c = 100;
	{
		
		System.out.println(i);
		
	}
	static {
		//System.out.println(i);
		i = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}

}
