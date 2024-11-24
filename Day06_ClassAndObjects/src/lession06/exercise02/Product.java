package lession06.exercise02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Product {
	private String code;
	private String name;
	private BigInteger quantity;
	private BigDecimal price;
	
	public void display(int no) {
		System.out.printf("%3d %-30s %9d %,15.2f %,15.2f%n",no,
				this.name, this.quantity, this.price, this.totalPrice());
		
	}
	public BigDecimal totalPrice() {
		return this.price.multiply(new BigDecimal(this.quantity));
	}

	public Product() {
		super();
	}


	public Product(String code, String name, BigInteger quantity, BigDecimal price) {
		super();
		this.code = code;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BigInteger getQuantity() {
		return quantity;
	}


	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	public void edit() {
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n\t\tSỬA THÔNG TIN HANG HOA");
			System.out.println("Hãy lựa chọn 1 thông tin cần sửa");
			System.out.println("\tBam 1. sửa ten hang");
			System.out.println("\tBam 2. Sửa so luong");
			System.out.println("\tBam 3. Sửa don gia");
			System.out.println("\tBam 0. Quay lại");
			
			System.out.print("Nhập lựa chọn: ");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				
				System.out.print("\tNhap ten hang moi: ");
				this.setName(sc.nextLine());
				System.out.println("\t Sua ten hang thành công!");
				break;
			case 2:
				System.out.print("\tNhap so luong moi: ");
				this.setQuantity(new BigInteger(sc.nextLine()));
				System.out.println("\t Sua so luong thành công!");
				break;
			
			case 3:
				System.out.print("\tNhap don gia moi: ");
				this.setPrice(new BigDecimal(sc.nextLine()));
				System.out.println("\t Sua don gia thành công!");
				break;
			case 0:
				return; // Quay lại menu cha
			
			default:
				System.out.println("Lựa chọn không phù hợp !!!");
				break;
			}
		}while(true);
	}
	
}
