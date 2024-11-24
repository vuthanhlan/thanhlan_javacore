package exercise02;

import java.util.Scanner;

public class Problem03 {
	
	public static double input(String x) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập "+x+" : ");		
		return Double.parseDouble(sc.nextLine());
				
	}
	public static double value(int n, double x) {
		double s=1;
		for(int i = 1; i <= n; i++) {
			s+= 2 * i * Math.pow(x, 2 * i);
		}
		return s;
		
	}
	public static void display() {
		int n = (int)input("n");
		double x = input("x");
		double s = value(n,x);
		System.out.printf("s = %.2f",s);
	}
}
