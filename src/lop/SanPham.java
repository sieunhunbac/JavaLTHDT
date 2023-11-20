package lop;
import java.io.Serializable;
public class SanPham implements Serializable {
	private String MaSP;
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(String maSP, String tenSP, String cauHinh, String hangSX, float gia) {
		super();
		MaSP = maSP;
		TenSP = tenSP;
		CauHinh = cauHinh;
		HangSX = hangSX;
		Gia = gia;
	}
	public String getMaSP() {
		return MaSP;
	}
	public void setMaSP(String maSP) {
		MaSP = maSP;
	}
	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public String getCauHinh() {
		return CauHinh;
	}
	public void setCauHinh(String cauHinh) {
		CauHinh = cauHinh;
	}
	public String getHangSX() {
		return HangSX;
	}
	public void setHangSX(String hangSX) {
		HangSX = hangSX;
	}
	public float getGia() {
		return Gia;
	}
	public void setGia(float gia) {
		Gia = gia;
	}
	private String TenSP;
	private String CauHinh;
	private String HangSX;
	private float Gia;
	
	
}
