package bai2_17;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	private double thue;
	
	public SachThamKhao () {
		super();
	}

	public SachThamKhao(int maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXB, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		// TODO Auto-generated constructor stub
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	public double thanhTien() {
		return getSoLuong() * getDonGia() + thue;
	}

	@Override
	public String toString() {
		return "SachThamKhao [thue=" + thue + ", toString()=" + super.toString() + "]";
	}
	
}
