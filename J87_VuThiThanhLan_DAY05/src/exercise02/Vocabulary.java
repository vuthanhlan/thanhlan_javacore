package exercise02;

import java.util.Scanner;

public class Vocabulary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Nhập số lượng từ vựng: ");
		int n= sc.nextInt();
		sc.nextLine();
		
		String[] words= new String[n];
		Insert(words, n);
		
		System.out.println("\nDanh sách từ vựng vừa nhập");
		display(words, n);
		
		System.out.print("\nNhập từ cần tìm: ");
		String key = sc.nextLine();
		search(words, key, n);
		
		sort(words, n);
		System.out.println("\nDanh sách từ vựng sắp xếp theo thứ tự từ điển: ");
		display(words, n);
		
	}
	
	//Hàm nhập
	public static void Insert(String[] words,int n) {
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<n; i++) {
			System.out.print("Nhập từ vựng thứ " + (i+1) +": ");
			words[i]= sc.nextLine();
		}
	}
	
	//Hàm hiển thị
	
	public static void display(String[] words, int n) {
		for(int i=0; i<n; i++) {
			System.out.println(words[i]);
		}
	}
	
	//hàm tra từ vựng
	public static void search(String[] words, String key, int n) {
		int count=0;
		for(int i=0; i<n; i++) {
			if(words[i].equalsIgnoreCase(key)) {
				count++;
			}
		}
		if(count ==0) {
			System.out.println("Từ "+key+" không có trong danh sách!!!");
		}else {
			System.out.println("Từ "+key+" có trong danh sách");
		}
		
	}
	
	// Hàm sắp xếp danh sách theo thứ tự từ điển
	public static void sort(String[] words, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n;j++) {
				if(words[i].compareToIgnoreCase(words[j])>0) {
					String tmp= words[i];
					words[i] = words[j];
					words[j]= tmp;
				}
				
			}
		}
	}

}
