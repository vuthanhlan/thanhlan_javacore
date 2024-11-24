package lession07.exercise01;

public class Electronic  extends Product{
	
	private double power;
	private double price;
	@Override
	public void input() {
		super.input();
		System.out.print("\t Nhap cong suất san pham: ");
		this.power = Double.parseDouble(sc.nextLine());
		
		System.out.print("\t Nhap gia tien san pham: ");
		this.price = Double.parseDouble(sc.nextLine());
	}
	
	public void display() {
		super.display();
		
		System.out.printf("%9.1f %,15.2f%n", this.power, this.price);
	}
	
	public Electronic() {
		super();
	}
	public Electronic(String code, String name, String date, double power, double price) {
		super(code, name, date);
		this.power = power;
		this.price = price;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
