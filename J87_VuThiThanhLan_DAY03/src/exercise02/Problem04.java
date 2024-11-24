package exercise02;

import java.util.Scanner;

public class Problem04 {
	private static double xA,yA,xB,yB,xC,yC;
	
	public static void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập tọa độ điểm A");
		System.out.print("Nhập xA: ");
		xA=Double.parseDouble(sc.nextLine());
		System.out.print("Nhập yA: ");
		yA=Double.parseDouble(sc.nextLine());
		
		System.out.println("Nhập tọa độ điểm B");
		System.out.print("Nhập xB: ");
		xB=Double.parseDouble(sc.nextLine());
		System.out.print("Nhập yB: ");
		yB=Double.parseDouble(sc.nextLine());
		
		System.out.println("Nhập tọa độ điểm C");
		System.out.print("Nhập xC: ");
		xC=Double.parseDouble(sc.nextLine());
		System.out.print("Nhập yA: ");
		yC=Double.parseDouble(sc.nextLine());
	}
	public static void solve() {
		double AB=Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
		double BC = Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));
	    double CA = Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2));
	    double p=( AB + BC + CA)/2;
	    double area=Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));

        if (area == 0) {
            System.out.println("Ba điểm A, B, C thẳng hàng. Không tạo thành tam giác.");
        } else {
            
            double perimeter = AB + BC + CA;

            System.out.printf("Độ dài cạnh AB: %.2f\n", AB);
            System.out.printf("Độ dài cạnh BC: %.2f\n", BC);
            System.out.printf("Độ dài cạnh CA: %.2f\n", CA);
            System.out.printf("Chu vi tam giác: %.2f\n", perimeter);
            System.out.printf("Diện tích tam giác: %.2f\n", area);
        }
	}
	public static void display() {
		input();
		solve();
	}
}
