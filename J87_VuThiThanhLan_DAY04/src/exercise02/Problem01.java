package exercise02;

import java.util.Scanner;

public class Problem01 {
	public static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập 1 sô nguyên dương: ");
		return Integer.parseInt(sc.nextLine());
	}
	public static boolean Isprime(int n) {
		if(n <= 1) {
			return false;
		}else {
			for(int i = 2; i * i <= n; i++) {
				if(n%i == 0) {
					return false;
			}
		}
			return true;
		}
		
	}
	public static void display() {
		int n = input();
		if(Isprime(n)){
			System.out.println(n +" là số nguyên tố");
		}else {
			System.out.println(n+" không phải số nguyên tố");
		}
	}
}
