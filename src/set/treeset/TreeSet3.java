package set.treeset;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("A");
		//set.add(1);  not possible
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println(set);
		
		System.out.println("inital set: " +set);
		
		System.out.println("Reverse set: " +set.descendingSet());
		
		System.out.println("Head set head inclusive: " +set.headSet("C", true));
		
		System.out.println("Head set head exclusive: " +set.headSet("C"));
		
		System.out.println("SubSet: " +set.subSet("A", false, "E", true));
		
		System.out.println("TailSet: " +set.tailSet("C", false));
		
		//various sorting 
		System.out.println("various sorting");
		System.out.println("Intial Set: "+set);  
        
        System.out.println("Head Set: "+set.headSet("C"));  
         
        System.out.println("SubSet: "+set.subSet("A", "E"));  
          
        System.out.println("TailSet: "+set.tailSet("C"));  
	}

}
