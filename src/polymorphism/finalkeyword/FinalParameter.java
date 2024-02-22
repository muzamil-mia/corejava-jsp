package polymorphism.finalkeyword;

public class FinalParameter {
	int cube(final int n) {
		//n = n + 2;
		return 0;
	}

	public static void main(String[] args) {
		FinalParameter b1 = new FinalParameter();
		final int i;
		b1.cube(i = 5);
	}
}
