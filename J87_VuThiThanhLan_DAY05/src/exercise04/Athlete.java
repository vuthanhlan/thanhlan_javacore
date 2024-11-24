package exercise04;

import java.util.Scanner;

public class Athlete {

	public static void main(String[] args) {
		String[] names= {"Bui Van Trung","Truong Thu Huong",
				"Nguyen Thu Trang","Duong Truong Khoi",
				"Doan Thuong Gia","Chu Khac Quyet",
				"Doan Thuong Truong","Bui Duong Thao",
				"Tran Van Truong","Bach Xuan Quang"};
		int[][] scores= {{100, 105, 110},
						{95, 100, 105},
						{90, 95, 100},
						{85, 90, 95},
						{80, 85, 90},
						{120, 125, 130},
						{110, 115, 120},
						{95, 100, 105},
						{100, 105, 110},
						{85, 90, 95}
						};
		int[] totalscore= new int[10];
		for(int i=0; i<10; i++) {
			int r=0;
			for(int j=0; j<3; j++) {
				r+=scores[i][j];
			}
			totalscore[i]=r;
		}
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("\n\t\tCHUONG TRINH QUAN LY DANH SÁCH VĐV CỬ TẠ");
			System.out.println("Hãy lựa chọn 1 chức năng quản lý");
			System.out.println("\tBam 1. Hien thi danh sach VĐV với thành tích 3 lần");
			System.out.println("\tBam 2. Hiển thị VĐV có tổng 3 lần cử tạ cao nhất");
			System.out.println("\tBam 3. Hiển thị 3 VĐV có thành tích cao nhất");
			System.out.println("\tBam 4. Sap xep danh sach theo tên");
			System.out.println("\tBam 5. Hiển thị danh sách VĐV có tên bắt đầu bằng T");
			System.out.println("\tBam 6. Hiển thị danh sách VĐV tên có vần an");
			System.out.println("\tBam 7. Sắp xếp danh sách VĐV theo chiều dài của tên tăng dần");
			System.out.println("\tBam 8. Hiển thị danh sách các VĐV có cùng thành tích và xếp thứ 2");
			System.out.println("\tBam 0. Đóng chương trình");
			
			System.out.print("Nhập lựa chọn: ");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("\n\t\t DANH SÁCH VẬN ĐỘNG VIÊN");
				display(names, scores, totalscore);
				break;
			case 2:
				System.out.println("\n\t\tVẬN ĐỘNG VIÊN CÓ THÀNH TÍCH CAO NHẤT");
				vdvCaoNhat(names, scores, totalscore);			
				break;
			case 3:
				display3athlete(names, scores, totalscore);
				break;
			case 4:
				sapXepTheoTen(names, scores, totalscore);
				
				break;
			case 5:
				displayNameStartByT(names, scores, totalscore);
				break;
			case 6:
				displayNameContainAN(names, scores, totalscore);
				break;
			case 7:
				sortByName(names, scores, totalscore);
				break;
			case 8:
				DisplaySecondScore(names, scores, totalscore);
				break;
			
			case 0:
				System.out.println("Đóng ứng dụng");
				System.exit(0);
			break;
			default:
				break;
			}
		}while(true);
	}
	//Hàm hiển thị 
	public static void display(String[] names, int[][] scores, int[] totalscore) {
		System.out.printf("%3s %-25s %-5s %-5s %-5s %-10s%n","STT","Họ tên","Lần 1","Lần 2","lần 3","Thành tích");
		
		for(int i=0; i<names.length; i++) {
			System.out.printf("%3d %-25s",i+1, names[i] );
			for(int j=0; j<3; j++) {
				System.out.printf("%6d",scores[i][j]);
			}
			System.out.printf("%11d%n",totalscore[i] );
		}
	}
	
	//hàm Hiển thị thông tin về VĐV có tổng 3 lần cử tạ (tổng TT) cao nhất.
	public static void vdvCaoNhat(String[] names, int[][] scores, int[] totalscore) {
		
		int maxIndex=0;
		for(int i=1; i<totalscore.length; i++) {
			if(totalscore[i] > totalscore[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.printf("%3s %-25s %-5s %-5s %-5s %-10s%n","STT","Họ tên","Lần 1","Lần 2","lần 3","Thành tích");
			System.out.printf("%3d %-25s",1, names[maxIndex] );
			for(int j=0; j<3; j++) {
				System.out.printf("%6d",scores[maxIndex][j]);
			}
			System.out.printf("%11d%n",totalscore[maxIndex] );
	}
	
	//Hàm sắp xếp
	//+ hàm đổi chỗ
	public static void swap(String[] names, int[][] scores, int[] totalscore, int i, int j) {
		
		String tg= names[i];
		names[i]= names[j];
		names[j]=tg;
		
		int[] temp = scores[i];
	    scores[i] = scores[j];
	    scores[j] = temp;
	    
	    int tg1= totalscore[i];
		totalscore[i]= totalscore[j];
		totalscore[j]=tg1;
	}
	
	//Hàm sắp xếp VĐV theo điểm tăng dần
	public static void sort(String[] names, int[][] scores, int[] totalscore) {
	        for (int i = 0; i < names.length - 1; i++) {
	            for (int j = i + 1; j < names.length; j++) {
	                if (totalscore[i] > totalscore[j]) {
	                    swap(names, scores, totalscore, i, j);
	                }
	            }
	        }
	}
	
	//Hàm hiển thị top 3 vđv có thành tích cao
	public static void display3athlete(String[] names, int[][] scores, int[] totalscore) {
		System.out.println("\n\tDANH SACH 3 VĐV CÓ THÀNH TÍCH CAO NHAT");
		System.out.printf("%3s %-25s %-5s %-5s %-5s %-10s%n","STT","Họ tên","Lần 1","Lần 2","lần 3","Thành tích");
		
		String[] n= names.clone();
		int[][] p=scores.clone();
		int[] c= totalscore.clone();
		
		sort(n, p, c);
		for(int i=n.length-1, count=0; i>=0 && count <3; i--, count++) {
			System.out.printf("%3d %-25s",count+1, n[i] );
			for(int j=0; j<3; j++) {
				System.out.printf("%6d",p[i][j]);
			}
			System.out.printf("%11d%n",c[i] );
		}
		
	}
	
	//+ Ham tach lay ten tu ho ten
	public static String nameOf(String fullname) {
		return fullname.trim().substring(fullname.lastIndexOf(' ')+1);
	}
		
	public static void sapXepTheoTen(String[] names, int[][] scores, int[] totalscores) {
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (nameOf(names[i]).compareToIgnoreCase(nameOf(names[j])) > 0) {
                    swap(names, scores, totalscores, i, j);
                }
            }
        }
        display(names, scores, totalscores);
    }
	//Hàm hiển thị VĐV có tên bắt đầu bằng chữ 'T'
	public static void displayNameStartByT(String[] names,int[][] scores, int[] totalscores) {
		int count=0;
        System.out.println("\t\tDanh sách VĐV có tên bắt đầu bằng chữ 'T':");
        System.out.printf("%3s %-25s %-5s %-5s %-5s %-10s%n","STT","Họ tên","Lần 1","Lần 2","lần 3","Thành tích");
        for (int i = 0; i < names.length; i++) {
            if (nameOf(names[i]).startsWith("T")) {
            	count++;
            	System.out.printf("%3d %-25s",count, names[i] );
    			for(int j=0; j<3; j++) {
    				System.out.printf("%6d",scores[i][j]);
    			}
    			System.out.printf("%11d%n",totalscores[i] );
            }
        }
    }
	// Hàm hiển thị VĐV có tên chứa vần "an"
	public static void displayNameContainAN(String[] names,int[][] scores, int[] totalscores) {
        System.out.println("\n\t DANH SÁCH VĐV CÓ TÊN CHỨA VẦN 'AN'");
        int count=0;
        System.out.printf("%3s %-25s %-5s %-5s %-5s %-10s%n","STT","Họ tên","Lần 1","Lần 2","lần 3","Thành tích");
        for (int i = 0; i < names.length; i++) {
            if (nameOf(names[i]).toLowerCase().contains("an")) {
            	count++;
            	System.out.printf("%3d %-25s",count, names[i] );
    			for(int j=0; j<3; j++) {
    				System.out.printf("%6d",scores[i][j]);
    			}
    			System.out.printf("%11d%n",totalscores[i] );
            }
        }
    }
	
	// Hàm sắp xếp theo chiều dài tên
	 public static void sortByName(String[] names, int[][] scores, int[] totalScores) {
	        for (int i = 0; i < names.length - 1; i++) {
	            for (int j = i + 1; j < names.length; j++) {
	                if (nameOf(names[i]).length() > nameOf(names[j]).length()) {
	                    swap(names, scores, totalScores, i, j);
	                }
	            }
	        }
	        System.out.println("\n\t DANH SÁCH VĐV SẮP XẾP THEO CHIỀU DÀI CỦA TÊN");
	        display(names, scores, totalScores);
	    }
	//Hàm sắp xếp VĐV theo điểm giảm dần
		public static void sortDesc(String[] names, int[][] scores, int[] totalscore) {
		        for (int i = 0; i < names.length - 1; i++) {
		            for (int j = i + 1; j < names.length; j++) {
		                if (totalscore[i] < totalscore[j]) {
		                    swap(names, scores, totalscore, i, j);
		                }
		            }
		        }
		}
		// Hàm hiển thị VĐV có cùng tổng thành tích xếp thứ 2
	 public static void DisplaySecondScore(String[] names, int[][] scores, int[] totalScores) {
		sortDesc(names, scores, totalScores);
		int count=0;
		for(int i=0; i<names.length; i++) {
			count++;
		}
		
		if(count <2) {
			System.out.println("Không đủ VĐV để xác định thứ hạng 2.");
		}
		else {
			System.out.println("\n\t VẬN ĐỘNG VIÊN CÓ THÀNH TÍCH XẾP THỨ 2");
			System.out.printf("%3s %-25s %-5s %-5s %-5s %-10s%n","STT","Họ tên","Lần 1","Lần 2","lần 3","Thành tích");
			System.out.printf("%3d %-25s %6d %6d %6d %11d%n",1,names[1],scores[1][0],scores[1][1],scores[1][2],totalScores[1]);
		}
	}
	 
	 //hiển thị VĐV có cùng tổng thành tích xếp thứ 2 
}


