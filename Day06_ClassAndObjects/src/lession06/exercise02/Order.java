package lession06.exercise02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Order {
	
	private String code;
	private Customer customer;
	private Product[] products;
	
	public void display() {
		System.out.println("\t\t HÓA ĐƠN BÁN HÀNG");
		System.out.printf("\t%15s","So:"+this.code);
		this.customer.display();
		System.out.printf("%3s %-30s %9s %15s %15s%n","STT"
				,"Tên hàng","Số lượng","ĐƠn giá","Thành tiền");
		int no=1;
		BigDecimal total= BigDecimal.ZERO;
		for(Product product: products) {
			product.display(no++);
			total = total.add(product.totalPrice());
		}
		System.out.printf("\t\t\tTổng tiền: %,2f%n", total);
	}
	
	public void editCustomer() {
		this.customer.edit();
		
	}
	
	public void editProduct() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhap ma hang can sua: ");
		String code= sc.nextLine();
//		tìm hàng hóa theo ma de sua hang
		int index= this.findProductByCode(code);
		if(index == -1) {
			System.out.println("\tSan pham khong co trong hang hoa");
			return;
		}
		this.products[index].edit();
	}
	public int findProductByCode(String code) {
		for(int index=0; index<this.products.length; index++) {
			if(this.products[index].getCode().trim().equals(code.trim())) {
				return index;
			}
		}
		return -1;
	}
	public Order() {
		super();
	}
	
	public Order(String code, Customer customer, Product[] products) {
		super();
		this.code = code;
		this.customer = customer;
		this.products = products;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	
	
}
