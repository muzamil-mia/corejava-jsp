package collectionframework.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		this.id = id;
		this.name=name;
		this.price=price;
	}
}


public class lambdaExpressionComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "hp laptop", 25000f));
		list.add(new Product(2, "dell laptop", 30000f));
		list.add(new Product(3, "keyboard", 25000f));
		
		System.out.println("sorting on basis of name");
		
		//implementing lambda expression
		Collections.sort(list,(p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for(Product p : list) {
			System.out.println(p.id + " " + p.name + " " +p.price);
		}
	}

}
