package lession06.constructor;

public class CarManagement {

	public static void main(String[] args) {
		Car toyCar= new Car();
		Car mazCar = new Car(2, "CX2", 45000, "Mazda");
		System.out.println(toyCar.toString());
		System.out.println(mazCar.toString());

	}

}
