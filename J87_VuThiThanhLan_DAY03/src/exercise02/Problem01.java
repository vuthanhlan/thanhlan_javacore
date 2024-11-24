package exercise02;

import java.util.Scanner;

public class Problem01 {
	
	public static char input() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhập một chữ số (0-9): ");
		String str = sc.nextLine();
		
		if(str!=null || str.length()>0) {
			return str.charAt(0);
		}else {
			return '\0';
		}
	}
	public static void read(char letter) {
		switch (letter) {
		case '0':
			System.out.println("Chữ số không");
			break;
		case '1':
			System.out.println("Chữ số một");
			break;
		case '2':
			System.out.println("Chữ số hai");
			break;
		case '3':
			System.out.println("Chữ số ba");
			break;
		case '4':
			System.out.println("Chữ số bốn");
			break;
		case '5':
			System.out.println("Chữ số năm");
			break;
		case '6':
			System.out.println("Chữ số sáu");
			break;
		case '7':
			System.out.println("Chữ số bảy");
			break;
		case '8':
			System.out.println("Chữ số tám");
			break;
		case '9':
			System.out.println("Chữ số chín");
			break;
		default:
			System.out.println("Ký tự nhập không hợp lệ");
			break;
		}
	}
	public static void display() {
		char let= input();
		read(let);
	}
}
