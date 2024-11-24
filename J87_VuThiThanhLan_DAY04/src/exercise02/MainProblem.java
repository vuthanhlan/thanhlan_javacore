package exercise02;

import java.util.Scanner;

public class MainProblem {

	public static void main(String[] args) {
		//Tạo 1 menu chọn
		
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n\t\tCHUONG TRÌNH ỨNG DỤNG GIẢI BÀI TOÁN");
			System.out.println("Hãy lựa chọn 1 bài toán bằng cách bấm phím số");
			System.out.println("\t Bấm 1. Kiểm tra số nguyên tố");
			System.out.println("\t Bấm 2. In và tính tổng các số nguyên tố");
			System.out.println("\t Bấm 3. Tính tổng biểu thức");
			System.out.println("\t Bấm 4. Tính gần đúng sinx");
			System.out.println("\t Bấm 5. Dãy Fibonaci");
			System.out.println("\t Bấm 0. Đóng chương trình");
			
			System.out.print("Lựa chọn của bạn: ");
			int choose = Integer.parseInt(sc.nextLine());
			
			switch (choose) {
			case 1:
				System.out.println("Giải bài toán 1");
				Problem01.display();
				break;
			case 2:
				System.out.println("Giải bài toán 2");
				Problem02.display();
				break;
			case 3:
				System.out.println("Giải bài toán 3");
				Problem03.display();
				break;
			case 4:
				System.out.println("Giải bài toán 4");
				Problem04.display();
				break;
			case 5:
				System.out.println("Giải bài toán 5");
				Problem05.display();
				break;
			case 0:
				System.out.println("Đóng ứng dụng");
				System.exit(0); //để kết thúc chương trình
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ, mời chọn lại");
				break;
			}
		}while (true);

	}

}
