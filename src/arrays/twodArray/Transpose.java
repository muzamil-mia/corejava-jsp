package arrays.twodArray;

public class Transpose {

	public static void main(String[] args) {
		int[][] arr = {{10,20,30},{40,50,60}};
		int row  = arr.length;
		int col = arr[0].length;
		for(int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
		String str = "ee sala cup  num de";
		int space = 0, newSpace = 0, count = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				newSpace++;
			}else if(newSpace > space) {
				count++;
				newSpace = 0;
			}
		}
		System.out.println(count);
	
	}

}
