package lession06.constructor;

public class Car {
	private int id;
	private String brand;
	private double price;
	private String manufacturer;
	public Car() {
		super();
		this.id=1;
		this.brand= "vios";
		this.price =25000;
		this.manufacturer = "toyota";
		
	}
	//Alt + shift + S
	public Car(int id, String brand, double price, String manufacturer) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.manufacturer = manufacturer;
	}
	//Alt + shift + S+S
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", price=" + price + ", manufacturer=" + manufacturer + "]";
	}
	
}
