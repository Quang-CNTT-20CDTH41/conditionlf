package basic.dev;

import java.util.Scanner;

public class bai9_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number: ");
		int number = sc.nextInt();
		if(number % 3 == 0) {
			System.out.printf("%d chia hết cho 3: ", number);
		}else if(number % 5 == 0) {
				System.out.printf("\n%d chia hết cho 5: ", number);
		}else {
			System.out.printf("%d không chia hết cho 3 và 5", number);
		}
	}		

}
