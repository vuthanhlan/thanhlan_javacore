package exercise02;

import java.util.Scanner;

public class Problem05 {
	private static int n;
	public static void input() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Nhập n: ");
		n=Integer.parseInt(sc.nextLine());		
	}
	public static void sovle() {
		if(n>0 && n<=999999) {
			int count=0;
			int sum=0;
			
			if(n>=100000) {
				count++; sum+=n%10; n/=10;
			}
			if(n>=10000) {
				count++; sum+=n%10; n/=10;
			}
			if(n>=1000) {
				count++; sum+=n%10; n/=10;
			}
			if(n>=100) {
				count++; sum+=n%10; n/=10;
			}
			if(n>=10) {
				count++; sum+=n%10; n/=10;
			}
			if(n>=1) {
				count++; sum+=n;
			}
			System.out.println("Số chữ số của n: " + count);
            System.out.println("Tổng các chữ số của n: " + sum);
		}else {
			System.out.println("Số nhập vào không hợp lệ. Vui lòng nhập một số nguyên dương có tối đa 6 chữ số.");
		}
	}
	public static void display() {
		input();
		sovle();;
	}
}
