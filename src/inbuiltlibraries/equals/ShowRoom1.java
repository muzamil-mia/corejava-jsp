package inbuiltlibraries.equals;

public class ShowRoom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus1 = new Bus(8, 4);
		Lorry lorry1 = new Lorry(8, 4);
		Bus bus2 = new Bus(4,45);
		
		System.out.println(bus1.equals(lorry1));
		System.out.println(lorry1.equals(bus1));
		//System.out.println(bus1.equals(bus2));
	}

}
