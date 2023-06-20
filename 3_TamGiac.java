package bai3;

public class TamGiac {
	private int ma;
	private int mb;
	private int mc;
	
	public TamGiac() {
		ma = 0;
		mb = 0;
		mc = 0; 
	}

	public TamGiac(int a, int b, int c) {
		if(a+b<=c || a+c<b || b+c<=a) {
			ma = mb = mc = 0;
			return;
		}
		ma=a;
		mb=b;
		mc=c;
	}
	
	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		if(this.ma < 0) {
			this.ma = 0;
		}
		else {
			this.ma = ma;
		}
	}

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		if(this.mb < 0) {
			this.mb = 0;
		}
		else {
			this.mb = mb;
		}
	}

	public int getMc() {
		return mc;
	}

	public void setMc(int mc) {
		if(this.mc <= 0) {
			this.mc = 0;
		}
		else {
			this.mc = mc;
		}
	}
	
	public String kieuTamGiac() {
		if(ma+mb>mc || ma+mc>mb || mb+mc>ma) {
			if(ma==mb && mb==mc) {
				return "la tam giac deu";
			}
			else if (ma==mb || ma==mc || mb==mc) { 
				return "la tam giac can";
			}
			else {
				return "la tam giac thuong";
			}
		}
		else {
			return "khong phai la tam giac";
		}
	}
	
	public int getChuVi() {
		return ma+mb+mc;
	}
	
	public double getDienTich() {
		double p;
		p=(ma+mb+mc)/2;
		return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
	}

	@Override
	public String toString() {
		return "TamGiac [ma=" + ma + ", mb=" + mb + ", mc=" + mc + ", kieuTamGiac=" + kieuTamGiac() + ", ChuVi="
				+ getChuVi() + ", DienTich=" + getDienTich() + "]";
	}
	
	
}
