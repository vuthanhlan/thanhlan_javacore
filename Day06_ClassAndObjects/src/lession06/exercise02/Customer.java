package lession06.exercise02;

import java.util.Scanner;

public class Customer {
	
	private String name;
	private String mobile;
	private String address;
	
	public void display() {
		System.out.println("\t Tên khách hàng: " + this.name);
		System.out.println("\t Số điện thoại: " + this.mobile);
		System.out.println("\t Địa chỉ: " + this.address);
	}
	
	public void edit() {
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n\t\tSỬA THÔNG TIN KHACH HANG");
			System.out.println("Hãy lựa chọn 1 thông tin cần sửa");
			System.out.println("\tBam 1. sửa ho ten khach hang");
			System.out.println("\tBam 2. Sửa so dien thoai");
			System.out.println("\tBam 0. Quay lại");
			
			System.out.print("Nhập lựa chọn: ");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				
				System.out.print("\tNhap ho ten moi: ");
				this.setName(sc.nextLine());
				System.out.println("\t Sua ho ten thành công!");
				break;
			case 2:
				System.out.print("\tNhap so dien thoai moi: ");
				this.setMobile(sc.nextLine());
				System.out.println("\t Sua so dien thoai thành công!");
				break;
			
			case 3:
				System.out.print("\tNhap dia chi moi: ");
				this.setAddress(sc.nextLine());
				System.out.println("\t Sua dia chi thành công!");
				break;
			case 0:
				return; // Quay lại menu cha
			
			default:
				System.out.println("Lựa chọn không phù hợp !!!");
				break;
			}
		}while(true);
	}
	public Customer() {
		super();
	}
	public Customer(String name, String mobile, String address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
}
