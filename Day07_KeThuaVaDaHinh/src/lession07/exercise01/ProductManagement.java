package lession07.exercise01;

import java.util.Scanner;

public class ProductManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Cho biet so luong san pham: ");
		Product[]products = new Electronic[Integer.parseInt(sc.nextLine())];
		input(products);
		display(products);
		
		
		displayMinPrice(products);

	}
	public static void input(Product[] products) {
		System.out.println("Nhap danh sach san pham");
		for(int index=0; index <products.length; index++) {
			System.out.println("Nhap thong tin san pham thu "+(index+1));
			products[index] = new Electronic();
			products[index].input();
			
		}
	}
	
	public static void display(Product[] products) {
		System.out.println("\t\t DANH SACH CAC SAN PHAM DIEN TU");
		System.out.printf("%-3s %-11s %-30s %-10s %-9s %-15s%n","STT","Ten san pham","Ma san pham","Ngay san xuat","Cong suat","Gia tien");
		int no=1;
		for(Product product: products) {
			System.out.printf("%3d", no++);
			product.display();
		}
	}
	
	public static void displayMinPrice(Product[] products) {
		System.out.println("\t\t DANH SACH CAC SAN PHAM DIEN TU");
		System.out.printf("%-3s %-11s %-30s %-10s %-9s %-15s%n","STT","Ten san pham","Ma san pham","Ngay san xuat","Cong suat","Gia tien");
		
		
		//Tim gia tien thap nhat
		double minPrice= ((Electronic) products[0]).getPrice();
		for(int index =1; index <products.length; index++) {
			if(((Electronic) products[index]).getPrice() < minPrice) {
				minPrice =((Electronic) products[index]).getPrice();
			}
		}
		int no=1;
		for(Product product: products) {
			if(((Electronic) product).getPrice() == minPrice) {
				System.out.printf("%3d", no++);
				product.display();
			}
			
		}
	}

}
