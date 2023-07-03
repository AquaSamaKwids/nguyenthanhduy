package bai1_17;

	public class ChuyenXeNgoaiThanh extends ChuyenXe{
	private String noiDen;
	private int soNgay;
	
	public ChuyenXeNgoaiThanh() {
		super();
	}

	public ChuyenXeNgoaiThanh(int maSo, String hoTenString, int soXe,String noiDen, int soNgay, double doanhThu) {
		super(maSo, hoTenString, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
		// TODO Auto-generated constructor stub
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	@Override
	public String toString() {
		return "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgay=" + soNgay + ", toString()=" + super.toString() + "]";
	}

}
