package lop;

public class KhachHang extends Nguoi {
	private String MaKH;
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMaSP() {
		return MaSP;
	}
	public void setMaSP(String maSP) {
		MaSP = maSP;
	}
	private String MaSP;
	private String DiaChi;
	private String Email;
	public KhachHang(String maKH, String ho, String tendem, String ten,  int ngaysinh, int thangsinh, int namsinh,
			String gioitinh,int sdt, String diaChi, String email,String maSP) {
		super(ho, tendem, ten, sdt, ngaysinh, thangsinh, namsinh, gioitinh);
		MaKH = maKH;
		DiaChi = diaChi;
		Email = email;
		MaSP = maSP;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String ho, String tendem, String ten, int sdt, int ngaysinh, int thangsinh, int namsinh,
			String gioitinh) {
		super(ho, tendem, ten, sdt, ngaysinh, thangsinh, namsinh, gioitinh);
		// TODO Auto-generated constructor stub
	}
}
