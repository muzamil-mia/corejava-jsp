package exam;

public class PrimeDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 538762;
		int rev = 0, pow = 1, result = 0;
		while(num > 0) {
			int rem = num % 10;
			int count = 0;
			for(int i = 1; i <= rem; i++) {
				if(rem % i == 0) {
					count++;
				}
			}
			if(count == 2) {
				result = rem * pow + result;
				pow*=10;
			}
			num/=10;
		}
		System.out.println(result);
	}

}
