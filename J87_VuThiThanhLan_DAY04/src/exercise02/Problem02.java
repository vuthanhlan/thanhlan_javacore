package exercise02;

import java.util.Scanner;

public class Problem02 {
	
	public static int input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập số nguyên dương n= ");		
		return Integer.parseInt(sc.nextLine());
				
	}
	public static boolean Isprime(int n) {
		if(n<=1) {
			return false;
		}else {
			for(int i=2; i * i<= n; i++) {
				if(n%i == 0)
					return false;
			}
			return true;
		}
	}
	public static void PrimeTotal(int n) {
		int sum =0;
		int i =0;
		int count =0;
		while(count != n) {
			if(Isprime(i)) {
				sum+= i;
				System.out.print(i +" ");
				count++;
			}
			i++;
		}
		System.out.print("\nTổng các số nguyên tố= "+ sum);
	}
	
	public static void display() {
		int n=input();
		PrimeTotal(n);
	}
}
