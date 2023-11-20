package lop;
import java.util.*;
public class QuanLyNhanVien {
	Scanner sc = new Scanner(System.in);
	public static ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
	
	public void nhap()
	{
		int i;
		System.out.print("Nhập số lượng nhân viên: ");
		int n=sc.nextInt();
		sc.nextLine();
		try {
		for(i=0; i<n;i++)
		{	System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t V");
			System.out.println("******************NHẬP DỮ LIỆU CHO NHÂN VIÊN THỨ " +i+"******************");
			System.out.print("|Nhập mã nhân viên "+i+" :");
			String MaNV = sc.next();
			MaNV = checkmaNVtrung(MaNV);
			System.out.print("|Nhập HỌ nhân viên "+i+" :");
			String Ho = sc.next();
			System.out.print("|Nhập TÊN ĐỆM nhân viên "+i+" :");
			String Tendem = sc.next();
			System.out.print("|Nhập TÊN nhân viên "+i+" :");
			String Ten = sc.next();
			System.out.print("|Nhập NGÀY SINH của nhân viên "+i+" :");
			int NgaySinh = sc.nextInt();
			System.out.print("|Nhập THÁNG SINH của nhân viên "+i+" :");
			int ThangSinh = sc.nextInt();
			System.out.print("|Nhập NĂM SINH của nhân viên "+i+" :");
			int NamSinh = sc.nextInt();
			System.out.print("|Nhập Gioi Tinh của nhân viên "+i+" :");
			String GioiTinh = sc.next();
			System.out.print("|Nhập SDT của nhân viên "+i+" :");
			int Sdt = sc.nextInt();
			System.out.print("|Nhập mức lương "+i+" :");
			int MucLuong = sc.nextInt();
			checkML(MucLuong);
			System.out.print("|Nhập số giờ làm "+i+" :");
			int SoGioLam = sc.nextInt();
			checkSGL(SoGioLam);
			int TongLuong = 0;
			NhanVien tam = new NhanVien (MaNV, Ho,Tendem,Ten,NgaySinh,ThangSinh,NamSinh,GioiTinh,Sdt, 
					MucLuong, SoGioLam, TongLuong);
			dsnv.add(tam);
			
			System.out.println("*********************************************************************");
		}}catch (Exception e) {
			System.out.println("!!!ĐÃ XẢY RA LỖI TRONG QUÁ TRÌNH NHẬP DỮ LIỆU!!!");
		}
		sc.nextLine();
	}
	public void display()
	{
	System.out.println("\t\t\t\t\t\t\t\t\t\t |");
	System.out.println("\t\t\t\t\t\t\t\t\t\t |");
	System.out.println("\t\t\t\t\t\t\t\t\t\t |");
	System.out.println("\t\t\t\t\t\t\t\t\t\t V");
	System.out.println("\t\t\t\t\t\t\t\t\t DANH SÁCH NHÂN VIÊN");
	System.out.println("\t\t\t---------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.printf("\t\t\t%-6s%-15s%-30s%-14s%-11s%-12s%-11s%-13s%-12s\n", "| STT ", "| Mã nhân viên |", "             Tên nhân viên        |","   Ngày sinh   |", " Giới tính |", "       SDT       |", "    Mức lương    |", " Số giờ làm |", " Tổng lương |");
	for (int i = 0; i < dsnv.size(); i++) {
		
		System.out.println(
				"\t\t\t|-----|--------------|----------------------------------|---------------|-----------|-----------------|-----------------|------------|------------|");
		System.out.printf("\t\t\t%-6s%-15s%-35s%-16s%-12s%-18s%-18s%-13s%-13s%-7s\n", "|  " + i, "| " + dsnv.get(i).getMaNV(),"| " + dsnv.get(i).getHo()+" "+dsnv.get(i).getTendem()+" "+dsnv.get(i).getTen(), "| "+ dsnv.get(i).getNgaysinh() +"/ "+dsnv.get(i).getThangsinh()+"/ "+dsnv.get(i).getNamsinh(),"| "+ dsnv.get(i).getGioitinh(),  "|"+ dsnv.get(i).getSdt(),"|"+ dsnv.get(i).getMucLuong(), "|"+dsnv.get(i).getSoGioLam(), "|"+dsnv.get(i).getTongLuong(),"|");
	}
	System.out.println("\t\t\t---------------------------------------------------------------------------------------------------------------------------------------------------");

	}
	public static void tongLuong () {
		int tong;
		for(int i=0;i<dsnv.size();i++) {
			tong = dsnv.get(i).getMucLuong()*dsnv.get(i).getSoGioLam();
			dsnv.get(i).setTongLuong(tong);
				
		}
	}
	public void chen(NhanVien obj, int vt)
	{
		dsnv.add(vt,obj);
	}
	public void xoa(String MaNV)
	{
		for(int i = 0; i < dsnv.size();i++)
		{
			if(dsnv.get(i).getMaNV().equals(MaNV)==true) dsnv.remove(i);
		}	
	}
	public static void sapxep()
	{
		Collections.sort(dsnv, new Comparator<NhanVien>()
		{
			@Override
			public int compare(NhanVien nv1, NhanVien nv2)
			{
				if(nv1.getTongLuong() < nv2.getTongLuong()) return -1;
				else if (nv1.getTongLuong()==nv2.getTongLuong()) return 0;
				else return 1;
			}
		});
	}
	public static void sua(String maNV,String ho, String tendem, String ten,  int ngaysinh, int thangsinh, int namsinh,String gioitinh,
			int sdt, int mucLuong, int soGioLam, int TongLuong, int i) 
	{
				System.out.println(i);
				dsnv.get(i).setHo(ho);
				dsnv.get(i).setTendem(tendem);
				dsnv.get(i).setTen(ten);
				dsnv.get(i).setNgaysinh(ngaysinh);
				dsnv.get(i).setThangsinh(thangsinh);
				dsnv.get(i).setNamsinh(namsinh);
				dsnv.get(i).setGioitinh(gioitinh);
				dsnv.get(i).setSdt(sdt);
				dsnv.get(i).setMucLuong(mucLuong);
				dsnv.get(i).setSoGioLam(soGioLam);
		}
//	public int checktrung(String maNV) {
//		for(int i=0 ; i < dsnv.size();i++)
//		{
//			if(dsnv.get(i).getMaNV().equals(dsnv.get(i).getMaNV()))
//			{
//				return i;
//			} return -1;
//		}
//		return -1;
//	}
	
	public static void timNhanvienTheoTen(String maNV,String ho, String tendem, String ten,  int ngaysinh, int thangsinh, int namsinh,String gioitinh,
			int sdt, int mucLuong, int soGioLam, int TongLuong) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String x;
			System.out.print("-----------> Nhập mã nhân viên cần tìm : ");
			x = sc.nextLine();
			for (int i = 0; i < dsnv.size(); i++) {
				if (dsnv.get(i).getMaNV().equals(x)) {
					System.out.println("\t\t\t\t DANH SÁCH NHÂN VIÊN");
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("%-6s%-15s%-30s%-14s%-11s%-12s%-11s%-13s%-12s\n", "| STT ", "| Mã nhân viên |", "             Tên nhân viên        |","   Ngày sinh   |", " Giới tính |", "       SDT       |", "    Mức lương    |", " Số giờ làm |", " Tổng lương |");	
						System.out.println(
								"|-----|--------------|----------------------------------|---------------|-----------|-----------------|-----------------|------------|------------|");
						System.out.printf("%-6s%-15s%-35s%-16s%-12s%-18s%-18s%-13s%-13s%-7s\n", "|  " + i, "| " + dsnv.get(i).getMaNV(),"| " + dsnv.get(i).getHo()+" "+dsnv.get(i).getTendem()+" "+dsnv.get(i).getTen(), "| "+ dsnv.get(i).getNgaysinh() +"/ "+dsnv.get(i).getThangsinh()+"/ "+dsnv.get(i).getNamsinh(),"| "+ dsnv.get(i).getGioitinh(),  "|"+ dsnv.get(i).getSdt(),"|"+ dsnv.get(i).getMucLuong(), "|"+dsnv.get(i).getSoGioLam(), "|"+dsnv.get(i).getTongLuong(),"|");
					
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

					}
					count++;
				}
			System.out.println(
					"================================= ĐÃ TÌM THẤY NHÂN VIÊN  ================================");
			if (count == 0) {
				System.out.println("KHÔNG TÌM THẤY");
			}
	}
	public int checkML(int MucLuong)
	{
		while (true) 
		{
			try {
				if(MucLuong > 0) break;
				else {
					System.out.println("!!!Nhập dữ liệu không chính xác. Vui lòng nhập lại!!!");
					MucLuong = sc.nextInt();
				}
			}catch (Exception e) {System.out.println("Bạn đã nhập sai ");
		}
	}
		return MucLuong;
}
	public int checkSGL(int SoGioLam)
	{
		while (true) 
		{
			try {
				if(SoGioLam > 0) break;
				else {
					System.out.println("!!!Nhập dữ liệu không chính xác. Vui lòng nhập lại!!!");
					SoGioLam = sc.nextInt();
				}
			}catch (Exception e) {System.out.println("Bạn đã nhập sai ");
		}
	}
		return SoGioLam;
}
	public String checkmanv(String maNV) {

		for(int i=0 ; i < dsnv.size();i++)
		{
			try {
				if(maNV.length() != 0) { System.out.println("!!!Nhập dữ liệu không chính xác. Vui lòng nhập lại!!!");
				System.out.print("|Nhập Mã nhân viên: ");
				maNV = sc.next();}
				else {
					break;
				}
			}catch (Exception e) {System.out.println("Bạn đã nhập sai ");
	}
		}
		return maNV;
	}
	
	public String checkmaNVtrung(String MaNV) {
		for (NhanVien nv : dsnv) {
			if(nv.getMaNV().equals(MaNV)) {
				System.out.println("!!!Mã nhân viên đã trùng. Mời nhập lại!!!");
				System.out.print("|Nhập Mã nhân viên: ");
				MaNV = sc.next();
			}
		}
		return MaNV;
	}
}
