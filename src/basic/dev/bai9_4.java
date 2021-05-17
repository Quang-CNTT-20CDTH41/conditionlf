package basic.dev;

import java.util.Scanner;

public class bai9_4 {
	private static Scanner sc = new Scanner(System.in);
	public static void GiaiPTbac2(int a, int b, int c) {
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phương trình vô nghiệm ! ");
			}else {
				System.out.println("Phương trình có 1 nghiệm là: x = " + (-c/b));
			}
		}
		float delta = b*b - 4*a*c;
		float x1, x2;
		if(delta > 0) {
			x1  = (float) ((-b + Math.sqrt(delta)) / (2*a));
			x2 = (float) ((-b - Math.sqrt(delta))/ (2*a));
			System.out.println("Phương trình có 2 nghiệm phân biệt là : x1 = " + x1 + " x2 = " + x2) ;
		}else if(delta == 0) {
			x1 = (float) (-b /(2*a));
			System.out.println("Phương trình có nghiệm kép là: x1 = x2 = "  + x1);
		}else {
			System.out.println("Phương trình vô nghiệm!");
		}
	}
	public static void main(String[] args) {
		System.out.println("Nhập a: ");
		int a = sc.nextInt();
		System.out.println("Nhập b: ");
		int b = sc.nextInt();
		System.out.println("Nhập c: ");
		int c = sc.nextInt();
		GiaiPTbac2(a,b,c);
	}

}
