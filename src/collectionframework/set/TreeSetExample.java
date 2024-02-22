package collectionframework.set;

public class TreeSetExample implements Comparable<TreeSetExample> {
	int id;
	String name;
	double marks;
	
	public TreeSetExample(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	

	
	public int compareTo(TreeSetExample o) {
		//sorting in name descending order
		return o.name.compareTo(this.name);
	}

}
