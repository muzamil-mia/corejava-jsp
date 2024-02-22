package private1;
import default1.*;
public class B extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		//System.out.println(obj.data);
		//obj is not visible since it is made private in A class
		//D obj1 = new D(); cannot create object of D class which is present in some other package because class is set to default
	    
	}

}
