package exercise02;

import java.util.Scanner;

public class Problem03 {
	private static double m;
	public static void input() {
		Scanner sc= new Scanner(System.in);
		System.out.print("\t Nhập số kg gạo: ");
		m= Double.parseDouble(sc.nextLine());
	}
	public static double payment() {
		
		if(m<=50) {
			return m*18000;
		}else if(m<=75) {
			return 50*18000 +(m-50)*(18000-1000);
		}else if(m<=115) {
			return 50*18000+25*(18000-1000)+(m-75)*(18000-1500);
		}else if(m<=185) {
			return 50*18000+25*(18000-1000)+40*(18000-1500)+(m-115)*(18000-900);
		}
		else {
			return 50*18000+25*(18000-1000)+40*(18000.0-1500)+70*(18000-900)+(m-185)*(18000-500);
		}
		
	}
	public static void display() {
		input();		
		System.out.printf("Số tiền cần trả là: %,.2f",payment());
	}
}
