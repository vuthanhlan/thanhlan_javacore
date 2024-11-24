package exercise02;

import java.util.Scanner;

public class Problem05 {
	
	public static int input(String x) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập "+ x +":");
		return Integer.parseInt(sc.nextLine());

	}
	public static void fibonaci(int n) {
		int f1 = 1, f2 = 1;
		System.out.print("Dãy Fiibonaci: "+ f1 +" "+ f2 +" ");
		int f;
		for(int i = 3; i <= n; i++) {
			f = f1 + f2;
			System.out.print(f+" ");
			f1 = f2;
			f2 = f;
		}
	}
	
	public static void display() {
		int n=input("Nhập số lượng phần tử của dãy fibonaci");
		fibonaci(n);
	}
}
