package bai2_17;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
	private String tinhTrang;
	
	public SachGiaoKhoa() {
		super();
	}

	public SachGiaoKhoa(int maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXB, String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		// TODO Auto-generated constructor stub
		this.tinhTrang = tinhTrang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	public double thanhTien() {
		if(tinhTrang.equals("moi")) {
			return getSoLuong() * getDonGia();
		}
		else if (tinhTrang.equals("cu")) {
			return getSoLuong() * getDonGia() * 0.5;
		}
		else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "SachGiaoKhoa [tinhTrang=" + tinhTrang + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
