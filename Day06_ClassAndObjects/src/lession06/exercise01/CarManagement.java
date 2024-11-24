package lession06.exercise01;

import java.util.Scanner;

public class CarManagement {

	public static void main(String[] args) {
		Car car= new Car(1011, "Vios", 25000, "Sedan", "Toyora", "VN");
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n\t\tCHUONG TRINH QUAN LY XE HƠI");
			System.out.println("Hãy lựa chọn 1 chức năng quản lý");
			System.out.println("\tBam 1. Hiển thị thông tin xe hơi");
			System.out.println("\tBam 2. Sửa thông tin xe hơi");			
			System.out.println("\tBam 0. Đóng chương trình");
			
			System.out.print("Nhập lựa chọn: ");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				System.out.println(car.toString());				
				break;
			case 2:
				editCar(car);		
				break;
						
			case 0:
				System.out.println("Đóng ứng dụng");
				System.exit(0);
				break;
			default:
				System.out.println("Lựa chọn không phù hợp !!!");
				break;
			}
		}while(true);

	}
	private static void editCar(Car car) {
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n\t\tSỬA THÔNG TIN XE HƠI");
			System.out.println("Hãy lựa chọn 1 thông tin cần sửa");
			System.out.println("\tBam 1. sửa nhãn hiệu");
			System.out.println("\tBam 2. Sửa giá tiền");
			System.out.println("\tBam 3. Sửa kiểu dáng");
			System.out.println("\tBam 4. Sửa tên hãng sản xuất");
			System.out.println("\tBam 5. Sửa xuất xứ");
			System.out.println("\tBam 0. Quay lại");
			
			System.out.print("Nhập lựa chọn: ");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				System.out.print("\tNhap nhan hieu moi: ");
				car.setBrand(sc.nextLine());
				System.out.println("\t Sua nhan hieu thành công!");
				
				break;
			case 2:
				System.out.print("\tNhap gia tien moi: ");
				car.setPrice(Double.parseDouble(sc.nextLine()));
				System.out.println("\t Sua giá tiền thành công!");		
				break;
			
			case 3:
				System.out.print("\tNhap kieu dang moi: ");
				car.setStyle(sc.nextLine());
				System.out.println("\t Sua kiểu dáng thành công!");
				break;
			case 4:
				System.out.print("\tNhap tên hãng sx moi: ");
				car.setManufacturer(sc.nextLine());
				System.out.println("\t Sua tên hãng sản xuất thành công!");
				break;
			case 5:
				System.out.print("\tNhap xuất sứ moi: ");
				car.setDerivation(sc.nextLine());
				System.out.println("\t Sua xuất xứ thành công!");
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
