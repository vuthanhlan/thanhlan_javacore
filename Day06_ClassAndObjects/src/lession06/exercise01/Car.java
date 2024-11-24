package lession06.exercise01;

public class Car {
	private int code;
	private String brand;
	private double price;
	private String style;
	private String manufacturer;
	private String derivation;
	public Car() {
		super();
	}
	public Car(int code, String brand, double price, String style, String manufacturer, String derivation) {
		super();
		this.code = code;
		this.brand = brand;
		this.price = price;
		this.style = style;
		this.manufacturer = manufacturer;
		this.derivation = derivation;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDerivation() {
		return derivation;
	}
	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}
	@Override
	public String toString() {
		return "Car [code=" + code + ", brand=" + brand + ", price=" + price + ", style=" + style + ", manufacturer="
				+ manufacturer + ", derivation=" + derivation + "]";
	}
	
	
	
	
}
