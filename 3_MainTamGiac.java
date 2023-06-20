package bai3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		TamGiac tg1 = new TamGiac(3, 4, 5);
		TamGiac tg2 = new TamGiac(4, 4, 6);
		TamGiac tg3 = new TamGiac(5, 5, 5);
		System.out.println(tg1.toString());
		System.out.println(tg2.toString());
		System.out.println(tg3.toString());
	}	
}






//public static void main(String[] args) {
//	System.out.println("Nhap 3 canh hinh tam giac");
//	Scanner input= new Scanner(System.in);
//	int ma=input.nextInt();
//	int mb=input.nextInt();
//	int mc=input.nextInt();
//	TamGiac tamGiac = new TamGiac(ma, mb, mc);
//	if(tamGiac.laTamGiac()) {
//		System.out.println("Chu vi: "+tamGiac.getChuVi());
//		System.out.println("Dien tich: "+tamGiac.getDienTich());

