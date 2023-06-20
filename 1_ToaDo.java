package nguyenThanhDuy.bai01;

public class ToaDo {
	private float x;
	private float y;
	private String ten;
	public ToaDo() {
		x=0;
		y=0;
		ten="";
	}
	public ToaDo(float x, float y, String ten) {
		this.x = x;
		this.y = y;
		this.ten = ten;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String toString() {
		return String.format("%s(%.1f,%.1f)",ten,x,y);
	}
}
