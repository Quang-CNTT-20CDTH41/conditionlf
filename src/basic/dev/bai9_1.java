package basic.dev;
import java.util.Scanner;
public class bai9_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int number = sc.nextInt();
//		if(number < 0) {
//			if(number % 2 == 0) {
//				System.out.println("Số âm chẵn");
//			}else {
//				System.out.println("Số âm lẽ");
//			}
//		}else {
//			if(number % 2 == 0) {
//				System.out.println("Số dương chẵn");
//			}
//			else {
//				System.out.println("Số dương lẽ");
//			}
//		}
		if(number >= 0 && number % 2 == 0) {
			System.out.println("Số dương chẵn");
		}else {
			if(number < 0) {
				if(number % 2 == 0) {
					System.out.println("Số âm chẵn");
				}else {
					System.out.println("Số âm lẽ");
				}
			}else {
				System.out.println("Số dương lẽ");
			}
		}
	}
}
