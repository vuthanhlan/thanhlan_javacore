package exercise02;

import java.util.Scanner;

public class Problem02 {
	private static double x;
	public static void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\t Nhập a: ");
		x= Double.parseDouble(sc.nextLine());
		
		
	}
	public static double solve() {
		
		if(x>2 && x<3) {
			return 5*Math.cos(3*x+2)-Math.log(x*x+2);
		}else if(x>=3) {
			return Math.pow(x+3,3);
		}else {
			return 1;
		}
		
	}
	public static void display() {
		input();
		System.out.printf("Kết quả biểu thức: %.2f",solve());
	}
}
