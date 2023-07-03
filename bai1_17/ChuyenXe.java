package bai1_17;

public class ChuyenXe {
	private int maSo;
	private String hoTen;
	private int soXe;
	private double doanhThu;
	
	public ChuyenXe() {
		super();
	}

	public ChuyenXe(int maSo, String hoTen, int soXe, double doanhThu) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public int getMaSo() {
		return maSo;
	}

	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}

	public String getHoTenString() {
		return hoTen;
	}

	public void setHoTenString(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getSoXe() {
		return soXe;
	}

	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	@Override
	public String toString() {
		return "ChuyenXe [maSo=" + maSo + ", hoTen=" + hoTen + ", soXe=" + soXe + ", doanhThu=" + doanhThu
				+ "]";
	}
	
}
