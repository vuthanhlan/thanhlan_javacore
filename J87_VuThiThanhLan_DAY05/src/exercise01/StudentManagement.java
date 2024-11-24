package exercise01;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhập số lượng thí sinh: ");
		int n= sc.nextInt();
		sc.nextLine();
		
		String[] names= new String[n];
		double[] math= new double[n];
		double[] literature= new double[n];
		double[] english= new double[n];		

		insert(names, math, literature, english, n);
		System.out.println("\t\t DANH SÁCH TỔNG ĐIỂM CỦA THÍ SINH");
		display(names, math, literature, english, n);
		
		sort(names, math, literature, english, n);
		
		System.out.println("\n");
		System.out.println("\t DANH SÁCH THÍ SINH SẮP XẾP TỔNG ĐIỂM THEO CHIỀU TĂNG DẦN");
		display(names, math, literature, english, n);
		
		display5student(names, math, literature, english, n);
	}
	
	//Hàm nhập thí sinh
	public static void insert(String[] names, double[] math, double[] literature, double[] english, int n) {
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<n; i++) {
			System.out.println("Nhập thông tin thí sinh thứ "+ (i+1)+":");
			System.out.print("tên: ");
			names[i]=sc.nextLine();
			System.out.print("Điểm toán: ");
			math[i]=sc.nextDouble();
			System.out.print("Điểm văn: ");
			literature[i]=sc.nextDouble();
			System.out.print("Điểm anh: ");
			english[i]=sc.nextDouble();
			sc.nextLine();
		}
		
	}
	
	//Hàm tính tổng điểm
	public static double total(double math, double literature, double english) {
		return math*1 + literature*1 + english*2;
	}

	//Hàm hiển thị tổng điểm
	
	public static void display(String[] names, double[] math, double[] literature, double[] english, int n) {
		
		System.out.printf("%3s %-25s %-9s %-8s %-8s %-9s%n","STT","Họ và tên","Điểm Toán","Điểm Văn","Điểm Anh","Tổng điểm");		
		for(int i=0; i<n; i++) {
			System.out.printf("%3s %-25s %9.2f %8.2f %8.2f %9.2f%n",i+1,names[i],math[i],literature[i],english[i],total(math[i],literature[i],english[i]));
		}
		
	}
	
	//hàm sắp xếp tổng điểm theo chiều tăng dần
	//+ Hàm đổi chỗ
	public static void swap(String[] names, double[] math, double[] literature, double[] english, int i, int j) {
		String t= names[i];
		names[i] = names[j];
		names[j] = t;
		
		double t1 = math[i];
		math[i] = math[j];
		math[j] = t1;
		
		double t2 = literature[i];
		literature[i] = literature[j];
		literature[j] = t2;
		
		double t3 = english[i];
		english[i] = english[j];
		english[j] = t3;
		
	}
	
	public static void sort(String[] names, double[] math, double[] literature, double[] english, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(total(math[i],literature[i],english[i]) > total(math[j],literature[j],english[j])) {
					swap(names, math, literature, english, i, j);
				}
			}
		}
	}
	
	public static void display5student(String[] names, double[] math, double[] literature, double[] english, int n) {
		System.out.println("\n\t DANH SÁCH 5 THÍ SINH CÓ TỔNG ĐIỂM CAO NHẤT");
		System.out.printf("%3s %-25s %-9s %-8s %-8s %-9s%n","STT","Họ và tên","Điểm Toán","Điểm Văn","Điểm Anh","Tổng điểm");
		
		String[] t=names.clone();
		double[] m=math.clone();
		double[] l=literature.clone();
		double[] e=english.clone();
		
		sort(t, m, l, e, n);
		for(int i=n-1, count=0; i>=0 && count <5;i--,count++ ) {
			System.out.printf("%3s %-25s %9.2f %8.2f %8.2f %9.2f%n",count+1,t[i],m[i],l[i],e[i],total(m[i],l[i],e[i]));
		}
		
	}
	
	
}
