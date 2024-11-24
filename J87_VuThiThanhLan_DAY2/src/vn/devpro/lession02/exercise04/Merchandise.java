package vn.devpro.lession02.exercise04;

import java.util.Scanner;

public class Merchandise {
	String name;
	int quantity;
	double price;
	
	public static void input(Merchandise merchandise) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\tNhập tên hàng hóa: ");
		merchandise.name=sc.nextLine();
		
		System.out.print("\tNhập số lượng: ");
		merchandise.quantity=Integer.parseInt(sc.nextLine());
		
		System.out.print("\tNhập đơn giá: ");
		merchandise.price=Double.parseDouble(sc.nextLine());
	}
	public static double money(Merchandise merchandise) {
		return (double)merchandise.quantity*merchandise.price;
	}
	
	public static void display(Merchandise merchandise) {
		System.out.printf("%-15s %6d %10.2f %12.2f %n", 
				merchandise.name,merchandise.quantity,
				merchandise.price,Merchandise.money(merchandise));
	}
}
