package lession06.exercise02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class OrderManagement {

	public static void main(String[] args) {
		
		Order order= new Order("10023826", 
				new Customer("Nguyen Truong Tung", "032587459", "Trai Ga-Cau Giay Ha Noi"),
				new Product[] {
						new Product("1001", "Sua chua vinamilk", new BigInteger("3"), new BigDecimal("9000")),
						new Product("1002", "Sua Dac co duong ong tho", new BigInteger("4"), new BigDecimal("29000")),
						new Product("1003", "Sua bot Dulux", new BigInteger("10"), new BigDecimal("19000")),
						new Product("1004", "Sua dau nanh", new BigInteger("8"), new BigDecimal("8000")),
						new Product("1005", "Sua hoa qua tuoi", new BigInteger("12"), new BigDecimal("10000"))
				}
				);
		
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n\t\tSỬA THÔNG TIN XE HƠI");
			System.out.println("Hãy lựa chọn 1 thông tin cần sửa");
			System.out.println("\tBam 1. Hien thi thong tin phieu mua hang");
			System.out.println("\tBam 2.Sua thong tin khach hang");
			System.out.println("\tBam 3. Sua thong tin hang hoa");
			
			System.out.println("\tBam 0. Quay lại");
			
			System.out.print("Nhập lựa chọn: ");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				order.display();
				break;
			case 2:
				order.editCustomer();	
				break;
			
			case 3:
				order.editProduct();
				break;


			case 0:
				System.out.println("Đóng ứng dụng");
				System.exit(0);
			
			default:
				System.out.println("Lựa chọn không phù hợp !!!");
				break;
			}
		}while(true);
	}

}
