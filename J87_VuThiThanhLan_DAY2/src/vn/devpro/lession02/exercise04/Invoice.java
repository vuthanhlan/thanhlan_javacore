package vn.devpro.lession02.exercise04;

import java.util.Scanner;

public class Invoice {
	String invoiceNumber;
	String customerName;
	String purchaseDate;
	Merchandise merchandise1 = new Merchandise();
	Merchandise merchandise2 = new Merchandise();
	Merchandise merchandise3 = new Merchandise();
	Merchandise merchandise4 = new Merchandise();
	Merchandise merchandise5 = new Merchandise();
	
	public static Invoice input() {
		 Invoice invoice=new Invoice();
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.print("\t Nhập số hóa đơn: ");
		 invoice.invoiceNumber=sc.nextLine();
		 
		 System.out.print("\t Nhập tên khách hàng: ");
		 invoice.customerName=sc.nextLine();
		 
		 System.out.print("\t Nhập ngày mua (DD-MM-YYYY): ");
		 invoice.purchaseDate=sc.nextLine();
		 
		 System.out.print("Nhập thông tin hàng hóa 1\n");
		 Merchandise.input(invoice.merchandise1);
		 
		 System.out.print("Nhập thông tin hàng hóa 2\n");
		 Merchandise.input(invoice.merchandise2);
		 
		 System.out.print("Nhập thông tin hàng hóa 3\n");
		 Merchandise.input(invoice.merchandise3);
		 
		 System.out.print("Nhập thông tin hàng hóa 4\n");
		 Merchandise.input(invoice.merchandise4);
		 
		 System.out.print("Nhập thông tin hàng hóa 5\n");
		 Merchandise.input(invoice.merchandise5);
		 
		 return invoice;
	}
	public static double sum(Invoice invoice) {
		return Merchandise.money(invoice.merchandise1) + 
				Merchandise.money(invoice.merchandise2)+
				Merchandise.money(invoice.merchandise3)+
				Merchandise.money(invoice.merchandise4)+
				Merchandise.money(invoice.merchandise5);
	}
	public static void display(Invoice invoice) {
		System.out.println("\t\t-----THÔNG TIN HÓA ĐƠN-------");
		
		System.out.println("\tSố hóa đơn: "+invoice.invoiceNumber);
		System.out.println("\tTên khách hàng: "+invoice.customerName);
		System.out.println("\tNgày mua: "+invoice.purchaseDate);
		
		System.out.printf("%-15s %-6s %-10s %-12s%n", "Tên hàng","Số lượng","Đơn giá","Thành tiền");
		Merchandise.display(invoice.merchandise1);
		Merchandise.display(invoice.merchandise2);
		Merchandise.display(invoice.merchandise3);
		Merchandise.display(invoice.merchandise4);
		Merchandise.display(invoice.merchandise5);
		
		System.out.printf("\tTổng tiền hàng: %.2f", sum(invoice));
		System.out.printf("\n\tTiền phải trả: %.2f",sum(invoice)+sum(invoice)*0.1);
	}
	
}
