package lession07.exercise01;

import java.util.Scanner;

public class Product {
	
	protected String code;
	protected String name;
	protected String date;
	
	Scanner sc=new Scanner(System.in);
	public void input() {
		System.out.print("\t Nhap ma san pham: ");
		this.code = sc.nextLine();
		
		System.out.print("\t Nhap ten san pham: ");
		this.name = sc.nextLine();
		
		System.out.print("\t Nhap ngay san xuat (dd/mm/yyyy): ");
		this.date = sc.nextLine();
	}
	
	public void display() {
		System.out.printf("%11s %-30s %10s", this.code, this.name, this.date);
	}
	
	public Product() {
		super();
	}
	public Product(String code, String name, String date) {
		super();
		this.code = code;
		this.name = name;
		this.date = date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
