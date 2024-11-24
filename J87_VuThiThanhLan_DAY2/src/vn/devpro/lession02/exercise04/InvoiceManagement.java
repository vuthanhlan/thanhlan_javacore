package vn.devpro.lession02.exercise04;

public class InvoiceManagement {

	public static void main(String[] args) {
		System.out.println("Nhập thông tin của hóa đơn");
		Invoice invoice= Invoice.input();
		
		
		Invoice.display(invoice);
		
	}

}
