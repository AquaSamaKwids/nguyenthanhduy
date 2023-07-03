package bai1_17;

public class ChuyenXeNoiThanh extends ChuyenXe{
	private int soTuyen;
	private int soKM;
	
	public ChuyenXeNoiThanh() {
		super();
	}

	public ChuyenXeNoiThanh(int maSo, String hoTen, int soXe, int soTuyen, int soKM, double doanhThu) {
		super(maSo, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKM;
		// TODO Auto-generated constructor stub
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKM() {
		return soKM;
	}

	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}

	@Override
	public String toString() {
		return "ChuyenXeNoiThanh [soTuyen=" + soTuyen + ", soKM=" + soKM + ", toString()=" + super.toString() + "]";
	}

}
