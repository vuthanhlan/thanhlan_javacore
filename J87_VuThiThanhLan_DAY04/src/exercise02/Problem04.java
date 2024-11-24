package exercise02;

import java.util.Scanner;

public class Problem04 {
	
	
	public static double input(String x) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhập "+x+":");
		return Double.parseDouble(sc.nextLine());

	}
	public static double sin(double x, double eps) {
        double a=x;
        double s=a; 
        int i=1;

        while (Math.abs(a) > eps) {
            a *= -x * x / ((2 * i)* (2 * i + 1)); 
            s += a;
            i++;
        }

        return s;
	}
	
	public static void display() {
		
		double x=input("x");
		double eps=input("sai số epsilon");
		double s=sin(x, eps);
		System.out.printf("Result: %f", s);
	}
}
