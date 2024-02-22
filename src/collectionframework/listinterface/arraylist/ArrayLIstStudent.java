package collectionframework.listinterface.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayLIstStudent {

	public static void main(String[] args) {
		Student s1 = new Student("muzamil", 24, 9);
		Student s2 = new Student("sabit", 24, 10);
		Student s3 = new Student("zahid", 29, 11);
		//creating arraylist
	    ArrayList<Student> list = new ArrayList<Student>();
	    list.add(s1);
	    list.add(s2);
	    list.add(s3);
	    
	    //getting generic iterator
	    
	    Iterator<Student> itr = list.iterator();
	    while(itr.hasNext()) {
	    	Student obj = itr.next();
	    	//System.out.print(obj + " ");
	    System.out.println("name: " + obj.name + ", age: "+ obj.age + ", marks: " + obj.rollno);
	    }
	    
	    
	    //getting non generic iterator
	    /**
	    Iterator itr1 = list.iterator();
	    while(itr1.hasNext()) {
	    	Student obj = (Student)itr1.next(); //here we need downcasting
	    	//System.out.print(obj + " ");
	    System.out.println("name: " + obj.name + ", age: "+ obj.age + ", marks: " + obj.rollno);
	    }
	    */

	    //using for loop
	    /**
	    for(int i = 0; i < list.size(); i++) {
	    	Student obj = list.get(i);
	    	System.out.println("name: " + obj.name + ", age: "+ obj.age + ", marks: " + obj.rollno);
	    }
	    */
	    
	    //using for each loop
	    for(Student obj : list) {
	    	System.out.println("name: " + obj.name + ", age: "+ obj.age + ", marks: " + obj.rollno);
	    }
	}

}
