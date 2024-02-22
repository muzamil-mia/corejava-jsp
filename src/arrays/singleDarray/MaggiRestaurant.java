package arrays.singleDarray;

import java.util.Scanner;

public class MaggiRestaurant {
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			System.out.println("enter the no. of plates");
			int no = sc.nextInt();
			Maggie[] plates = new Maggie[no];
			for (int i = 0; i < no; i++) {
				System.out.println("enter the price of the maggie");
				double price = sc.nextDouble();
				System.out.println("enter the manufacturing date");
				String mfd = sc.next();
				plates[i] = new Maggie(price, mfd);
			}
			
			System.out.print("[");
			for(Maggie plate : plates) {
				System.out.print("( ");
				System.out.print(plate);
				System.out.print(" )");
			}
			System.out.print("]");
		}
	}
