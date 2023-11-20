package lop;
import java.util.*;
import lop.SanPham;
public class QuanLyKhachHang {
	Scanner sc = new Scanner(System.in);
	public static ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
	public ArrayList<SanPham> dssp=new ArrayList<SanPham>();
	SanPhamDao obj = new SanPhamDao();

	public void nhap()
	{
		int i;
		System.out.print("Nhập số lượng Khách hàng: ");
		int c=sc.nextInt();
		try {
		for(i=0; i<c;i++)
		{	System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t V");
			System.out.println("******************NHẬP DỮ LIỆU CHO KHÁCH HÀNG THỨ " +i+"******************");
			System.out.print("|Nhập mã khách hàng "+i+" :");
			String MaKH = sc.next();
			System.out.print("|Nhập HỌ khách hàng "+i+" :");
			String Ho = sc.next();
			System.out.print("|Nhập TÊN ĐỆM khách hàng "+i+" :");
			String Tendem = sc.next();
			System.out.print("|Nhập TÊN khách hàng "+i+" :");
			String Ten = sc.next();
			System.out.print("|Nhập NGÀY SINH của khách hàng "+i+" :");
			int NgaySinh = sc.nextInt();
			System.out.print("|Nhập THÁNG SINH của khách hàng "+i+" :");
			int ThangSinh = sc.nextInt();
			System.out.print("|Nhập NĂM SINH của khách hàng "+i+" :");
			int NamSinh = sc.nextInt();
			System.out.print("|Nhập GIỚI TÍNH của khách hàng "+i+" :");
			String GioiTinh = sc.next();
			System.out.print("|Nhập Số điện thoại của khách hàng "+i+" :");
			int Sdt = sc.nextInt();
			System.out.print("|Nhập ĐỊA CHỈ của khách hàng "+i+" :");
			String DiaChi = sc.next();
			System.out.print("|Nhập Email "+i+" :");
			String Email = sc.next();
			System.out.print("Nhập mã sản phẩm "+" :");
			String MaSP = sc.next();
			KhachHang tam = new KhachHang (MaKH, Ho,Tendem,Ten,NgaySinh,ThangSinh,NamSinh,GioiTinh,Sdt, 
					DiaChi,Email,MaSP);
			dskh.add(tam);
			System.out.println("*********************************************************************");
		}}catch (Exception e) {
			System.out.println("!!!ĐÃ XẢY RA LỖI TRONG QUÁ TRÌNH NHẬP DỮ LIỆU!!!");
		}
	}
	public void display()
	{
	System.out.println("\t\t\t\t\t |");
	System.out.println("\t\t\t\t\t |");
	System.out.println("\t\t\t\t\t |");
	System.out.println("\t\t\t\t\t V");
	System.out.println("\t\t\t\t DANH SÁCH KHÁCH HÀNG");
	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.printf("%-6s%-15s%-30s%-14s%-11s%-12s%-11s%-13s%-12s\n", "| STT ", "| Mã khách hàng |", "             Tên khách hàng        |","   Ngày sinh   |", " Giới tính |", "       SDT       |", "           Địa chỉ          |", "           Email       ", "|");
	for (int i = 0; i < dskh.size(); i++) {
		
		System.out.println(
				"|-----|---------------|-----------------------------------|---------------|-----------|-----------------|----------------------------|-----------------------|");
		System.out.printf("%-6s%-16s%-36s%-16s%-12s%-18s%-29s%-24s%-13s\n", "|  " + i, "| " + dskh.get(i).getMaKH(),"| " + dskh.get(i).getHo()+" "+dskh.get(i).getTendem()+" "+dskh.get(i).getTen(), "| "+ dskh.get(i).getNgaysinh() +"/ "+dskh.get(i).getThangsinh()+"/ "+dskh.get(i).getNamsinh(),"| "+ dskh.get(i).getGioitinh(),  "|"+ dskh.get(i).getSdt(),"|"+ dskh.get(i).getDiaChi(), "|"+dskh.get(i).getEmail(),"|");
	}
	System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void chen(KhachHang obj, int vt)
	{
		dskh.add(vt,obj);
	}
	public void xoa(String MaKH)
	{
		for(int i = 0; i < dskh.size();i++)
		{
			if(dskh.get(i).getMaKH().equals(MaKH)==true) dskh.remove(i);
		}	
	}
//	public static void sapxep()
//	{
//		Collections.sort(dskh, new Comparator<KhachHang>()
//		{
//			@Override
//			public int compare(KhachHang kh1, KhachHang kh2)
//			{
//				if(kh1.getTongLuong() < nv2.getTongLuong()) return -1;
//				else if (nv1.getTongLuong()==nv2.getTongLuong()) return 0;
//				else return 1;
//			}
//		});
//	}
	public static void sua(String maKH, String ho, String tendem, String ten,  int ngaysinh, int thangsinh, int namsinh,
			String gioitinh,int sdt, String diaChi, String email, int i) 
	{
				System.out.println(i);
				dskh.get(i).setHo(ho);
				dskh.get(i).setTendem(tendem);
				dskh.get(i).setTen(ten);
				dskh.get(i).setNgaysinh(ngaysinh);
				dskh.get(i).setThangsinh(thangsinh);
				dskh.get(i).setNamsinh(namsinh);
				dskh.get(i).setGioitinh(gioitinh);
				dskh.get(i).setSdt(sdt);
				dskh.get(i).setDiaChi(diaChi);
				dskh.get(i).setEmail(email);
		}
	public static void timNhanvienTheoTen(String maKH, String ho, String tendem, String ten,  int ngaysinh, int thangsinh, int namsinh,
			String gioitinh,int sdt, String diaChi, String email) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String x;
			System.out.print("-----------> Nhập mã nhân viên cần tìm : ");
			x = sc.nextLine();
			for (int i = 0; i < dskh.size(); i++) {
				if (dskh.get(i).getMaKH().equals(x)) {
					System.out.println("\t\t\t\t\t |");
					System.out.println("\t\t\t\t\t |");
					System.out.println("\t\t\t\t\t |");
					System.out.println("\t\t\t\t\t V");
					System.out.println("\t\t\t\t DANH SÁCH KHÁCH HÀNG SAU KHI TÌM KIẾM");
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("%-6s%-15s%-30s%-14s%-11s%-12s%-11s%-13s%-12s\n", "| STT ", "| Mã khách hàng |", "             Tên khách hàng        |","   Ngày sinh   |", " Giới tính |", "       SDT       |", "           Địa chỉ          |", "           Email       ", "|");
					for (int i1 = 0; i1 < dskh.size(); i1++) {
						
						System.out.println(
								"|-----|---------------|-----------------------------------|---------------|-----------|-----------------|----------------------------|-----------------------|");
						System.out.printf("%-6s%-16s%-36s%-16s%-12s%-18s%-29s%-24s%-13s\n", "|  " + i, "| " + dskh.get(i).getMaKH(),"| " + dskh.get(i).getHo()+" "+dskh.get(i).getTendem()+" "+dskh.get(i).getTen(), "| "+ dskh.get(i).getNgaysinh() +"/ "+dskh.get(i).getThangsinh()+"/ "+dskh.get(i).getNamsinh(),"| "+ dskh.get(i1).getGioitinh(),  "|"+ dskh.get(i).getSdt(),"|"+ dskh.get(i).getDiaChi(), "|"+dskh.get(i).getEmail(),"|");
					}
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
					
					}
					count++;
	
				}
			System.out.println(
					"================================= ĐÃ TÌM THẤY NHÂN VIÊN  ================================");
			if (count == 0) {
				System.out.println("KHÔNG TÌM THẤY");
			}
	}
	public void hienthiSP() {
		for (KhachHang kh : dskh) {
			System.out.println("Mã khách hàng: " + kh.getMaKH());
			for (int i = 0; i < dssp.size(); i++) {
				String tam = dssp.get(i).getMaSP();
				if (ktra(tam).length() != 0) {
					System.out.println("Mã sản phẩm của khách hàng: " + tam);
				}
			}
		}
	}

	public String ktra(String tam) {
	    String ktra = "Không tìm thấy phẩm";
	    for (SanPham sp : dssp) {
	        if (sp.getMaSP().equals(tam)) {
	            ktra = sp.getMaSP();
	            break; // Thoát khỏi vòng lặp sau khi tìm thấy mã sản phẩm
	        }
	    }
	    return ktra;
	}
//	  public void hienthiHP()
//	   {
//		   for( SinhVien sv: dssv)
//		   {   System.out.println(" Ho ten:"+sv.getHoTen());
//			   for(int i=0; i<sv.dhp.size();i++)
//			   {  String tam=sv.dhp.get(i).getMhp();
//				   if(ktra(tam).length()!=0) System.out.print("Hp: "+tam+"diem: "+sv.dhp.get(i).getDiem());
//			   }
//		   }
//	   }
}
	
