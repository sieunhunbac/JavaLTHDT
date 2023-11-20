package lop;

public class NhanVien extends Nguoi{
	
	private String MaNV;
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public int getMucLuong() {
		return MucLuong;
	}
	public void setMucLuong(int mucLuong) {
		MucLuong = mucLuong;
	}
	public int getSoGioLam() {
		return SoGioLam;
	}
	public void setSoGioLam(int soGioLam) {
		SoGioLam = soGioLam;
	}
	public int getTongLuong() {
		return TongLuong;
	}
	public void setTongLuong(int tongLuong) {
		TongLuong = tongLuong;
	}
	private int MucLuong;
	private int SoGioLam;
	private int TongLuong;
	public NhanVien( String maNV,String ho, String tendem, String ten,  int ngaysinh, int thangsinh, int namsinh,String gioitinh,
			int sdt, int mucLuong, int soGioLam, int TongLuong) {
		super(ho, tendem, ten, sdt, ngaysinh, thangsinh, namsinh, gioitinh);
		this.MaNV = maNV;
		this.MucLuong = mucLuong;
		this.SoGioLam = soGioLam;
		this.TongLuong= TongLuong;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String ho, String tendem, String ten, int sdt, int ngaysinh, int thangsinh, int namsinh,
			String gioitinh) {
		super(ho, tendem, ten, sdt, ngaysinh, thangsinh, namsinh, gioitinh);
		// TODO Auto-generated constructor stub
	}
	
	}


