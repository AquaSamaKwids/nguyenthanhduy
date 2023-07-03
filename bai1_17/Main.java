package bai1_17;

public class Main {
	public static void main(String[] args) {
		NhaXe nhaXe1 = new NhaXe("Nha Xe Mien Dong");
		
		ChuyenXeNoiThanh chuyenXeNoiThanh1 = new ChuyenXeNoiThanh(1,"Nam",2,3,4,5);
		ChuyenXeNoiThanh chuyenXeNoiThanh2 = new ChuyenXeNoiThanh(6,"Quang",7,8,9,10);
		
		ChuyenXeNgoaiThanh chuyenXeNgoaiThanh1 = new ChuyenXeNgoaiThanh(1,"Hai",2,"HN",3,4);
		ChuyenXeNgoaiThanh chuyenXeNgoaiThanh2 = new ChuyenXeNgoaiThanh(5,"Van",6,"HCM",7,8);
		
		nhaXe1.themChuyenXe(chuyenXeNoiThanh1);
		nhaXe1.themChuyenXe(chuyenXeNoiThanh2);
		nhaXe1.themChuyenXe(chuyenXeNgoaiThanh1);
		nhaXe1.themChuyenXe(chuyenXeNgoaiThanh2);
		
		System.out.println("Tat ca chuyen xe");
		nhaXe1.xuatChuyenXe(0);
		System.out.println("Cac chuyen xe noi thanh");
		nhaXe1.xuatChuyenXe(1);
		System.out.println("cac chuyen xe ngoai thanh");
		nhaXe1.xuatChuyenXe(2);
		
		System.out.println("Tong doanh thu");
		nhaXe1.tinhDoanhThu(0);
		System.out.println("Doanh thu chuyen xe noi thanh");
		nhaXe1.tinhDoanhThu(1);
		System.out.println("Doanh thu chuyen xe ngoai thanh");
		nhaXe1.tinhDoanhThu(2);
	}
}
