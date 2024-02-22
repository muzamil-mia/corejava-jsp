package exam;

public class NumberOfThrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 20, n = 40;
		int count=0;
		for(int i = m; i <= n; i++) {
			int num1 = i;
			while(num1 > 0) {
				int rem = num1 % 10;
				if(rem == 3) {
					count++;
				}
				num1/=10;
			}
		}
		System.out.println(count);
	}

}
