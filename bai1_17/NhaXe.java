package bai1_17;

import java.util.ArrayList;

public class NhaXe {
	private String tenNhaXe;
	private ArrayList<ChuyenXe> listChuyenXe;
	public NhaXe(String tenNhaXe) {
		super();
		this.tenNhaXe = tenNhaXe;
	}
	
	public void themChuyenXe(ChuyenXe chuyen) {
		if(listChuyenXe.contains(chuyen)) {
			listChuyenXe.add(chuyen);
		}
		else {
			System.out.println("Chuyen xe da ton tai");
		}
	}
	
	public void xoaChuyenXe(ChuyenXe xe) {
		if(listChuyenXe.contains(xe)) {
			listChuyenXe.remove(xe);
		}
		else {
			System.out.println("Chuyen xe khong ton tai");
		}
	}
	
	public void xuatChuyenXe(int loai) {
		if(loai == 0) {
			for(ChuyenXe xe: listChuyenXe) {
				System.out.println(xe.toString());
			}
		}
		if(loai == 1) {
			for(ChuyenXe xe: listChuyenXe) {
				if(xe instanceof ChuyenXeNoiThanh) {
					System.out.println(xe.toString());
				}
			}
		}
		if(loai == 2) {
			for(ChuyenXe xe: listChuyenXe) {
				if(xe instanceof ChuyenXeNgoaiThanh) {
					System.out.println(xe.toString());
				}
			}
		}
	}
	
	public void tinhDoanhThu(int loai) {
		double tongDoanhThu = 0;
		if(loai == 0) {
			for(ChuyenXe xe: listChuyenXe) {
				tongDoanhThu += xe.getDoanhThu();
			}
			System.out.println("Tong doanh thu:" + tongDoanhThu);
		}
		if(loai == 1) {
			for(ChuyenXe xe: listChuyenXe) {
				if(xe instanceof ChuyenXeNoiThanh) {
					tongDoanhThu += xe.getDoanhThu();
				}
				System.out.println("Tong doanh thu chuyen xe noi thanh" + tongDoanhThu);
			}
		}
		if(loai == 2) {
			for(ChuyenXe xe: listChuyenXe) {
				if(xe instanceof ChuyenXeNgoaiThanh) {
					tongDoanhThu += xe.getDoanhThu();
				}
				System.out.println("Tong doanh thu chuyen xe ngoai thanh" + tongDoanhThu);
			}
		}
	}

	public String getTenNhaXe() {
		return tenNhaXe;
	}

	public void setTenNhaXe(String tenNhaXe) {
		this.tenNhaXe = tenNhaXe;
	}
	
}
