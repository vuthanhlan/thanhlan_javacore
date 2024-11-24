package vn.devpro.lession02.exercise02;

import java.util.Scanner;

public class CitizenManagement {
	
	public static Citizen input() {
		Citizen citizen=new Citizen();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Nhập số thẻ căn cước: ");
		citizen.idcard=sc.nextLine();		
		System.out.print("Nhập họ đệm: ");
		citizen.lastname=sc.nextLine();
		System.out.print("Nhập tên: ");
		citizen.firstname=sc.nextLine();
		System.out.print("Nhập ngày sinh (DD-MM-YYYY): ");
		citizen.dateOfBird=sc.nextLine();
		System.out.print("Nhập giới tính: ");
		citizen.gender=sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		citizen.address=sc.nextLine();
		System.out.print("Nhập số điện thoại: ");
		citizen.phonenumber=sc.nextLine();
		
		return citizen;
	}
	
	public static void display(Citizen citizen) {
		System.out.printf("%-12s %-25s %10s %-9s %-20s %10s %n", 
				citizen.idcard, citizen.lastname+" "+citizen.firstname, 
				citizen.dateOfBird, citizen.gender, citizen.address,citizen.phonenumber);
	}
	public static void main(String[] args) {
		System.out.println("Nhập thông tin công dân thứ nhất: ");
		Citizen citizen1 = input();
		
		System.out.println("Nhập thông tin công dân thứ hai: ");
		Citizen citizen2 = input();
		
		System.out.println("Nhập thông tin công dân thứ ba: ");
		Citizen citizen3 = input();
		
		System.out.println("Nhập thông tin công dân thứ tư: ");
		Citizen citizen4 = input();
		
		System.out.println("Nhập thông tin công dân thứ năm: ");
		Citizen citizen5 = input();
		
		System.out.println();
		System.out.println("\t\t------------DANH SÁCH CÔNG DÂN------------");
		System.out.printf("%-12s %-25s %10s %-9s %-20s %10s %n",
				"số thẻ","Họ tên","ngày sinh","giới tính","địa chỉ","số điện thoại" );
		display(citizen1);
		display(citizen2);
		display(citizen3);
		display(citizen4);
		display(citizen5);
	}

}
