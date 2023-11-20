package lop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {
	SanPhamDao obj = new SanPhamDao();
	Scanner sc = new Scanner(System.in);
	public ArrayList<SanPham> dssp = new ArrayList<SanPham>();
	public void khoiTao()
	{	
		int i;
		System.out.print("Nhập số lượng Sản phẩm: ");
		int n=sc.nextInt();
		sc.nextLine();
		try {
		for(i=0; i<n;i++)
		{	System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t V");
			System.out.println("******************NHẬP DỮ LIỆU CHO SẢN PHẨM THỨ " +i+"******************");
			System.out.print("|Nhập MÃ sản phẩm  "+i+" :");
			String MaSP = sc.next();
			System.out.print("|Nhập TÊN sản phẩm "+i+" :");
			String TenSP = sc.next();
			System.out.print("|Nhập Cấu hình sản phẩm "+i+" :");
			String CauHinh = sc.next();
			System.out.print("|Nhập HÃNG sản xuất sản phẩm "+i+" :");
			String HangSX = sc.next();
			System.out.print("|Nhập Giá sản phẩm "+i+" :");
			float Gia = sc.nextInt();
			SanPham tam = new SanPham (MaSP, TenSP, CauHinh, HangSX, Gia);
			dssp.add(tam);
			System.out.println("*********************************************************************");
		}}catch (Exception e) {
			System.out.println("!!!ĐÃ XẢY RA LỖI TRONG QUÁ TRÌNH NHẬP DỮ LIỆU!!!");
		}
		obj.ghiFile(dssp); }
	
	public void docFile()
	{
		dssp = obj.docFile("d:\\dssp2.bin");
	}
	public void hienthi()
	{
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t |");
			System.out.println("\t\t\t\t\t V");
			System.out.println("\t\t\t\t DANH SÁCH SẢN PHẨM");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-6s%-15s%-36s%-35s%-16s%-19s\n", "| STT ", "| Mã Sản phẩm  |", "             Tên sản phẩm         |","              Cấu hình              |", " Hãng sản xuất |", "           Giá           |");
			for (int i = 0; i < dssp.size(); i++) {
				
				System.out.println(
						"|-----|--------------|----------------------------------|-------------------------------------|---------------|-------------------------|");
				System.out.printf("%-6s%-15s%-35s%-38s%-16s%-26s%-1s\n", "|  " + i ,"|"+ dssp.get(i).getMaSP(),"|"+ dssp.get(i).getTenSP(),"|"+dssp.get(i).getCauHinh(),"|"+dssp.get(i).getHangSX(),"|"+dssp.get(i).getGia(),"|");
			}
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");

	}
	public void hienThidk(String hangsx)
	{
		for(SanPham sp:dssp)
		{
			if(sp.getHangSX().equals(hangsx))
			{
				System.out.println("\t\t\t\t\t |");
				System.out.println("\t\t\t\t\t |");
				System.out.println("\t\t\t\t\t |");
				System.out.println("\t\t\t\t\t V");
				System.out.println("\t\t\t\t DANH SÁCH SẢN PHẨM");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
				System.out.printf("%-6s%-15s%-36s%-35s%-16s%-19s\n", "| STT ", "| Mã Sản phẩm  |", "             Tên sản phẩm         |","              Cấu hình              |", " Hãng sản xuất |", "       Giá       |");
				for (int i = 0; i < dssp.size(); i++) {
					
					System.out.println(
							"|-----|--------------|----------------------------------|-------------------------------------|---------------|-----------------|");
					System.out.printf("%-6s%-15s%-35s%-38s%-16s%-18s%-1s\n", "|  " + i ,"|"+ dssp.get(i).getMaSP(),"|"+ dssp.get(i).getTenSP(),"|"+dssp.get(i).getCauHinh(),"|"+dssp.get(i).getHangSX(),"|"+dssp.get(i).getGia(),"|");
				}
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
			}
		}
	}
	
	public void chen(SanPham obj1, int vt)
	{
		dssp.add(vt,obj1);
		obj.ghiFile(dssp);
	}
	public void xoa(String MaSP)
	{
		for(int i = 0; i < dssp.size();i++)
		{
			if(dssp.get(i).getMaSP().equals(MaSP)==true) dssp.remove(i);
		}
	}
	
	public void sapxep()
	{
		Collections.sort(dssp, new Comparator<SanPham>()
		{
			@Override
			public int compare(SanPham sp1, SanPham sp2)
			{
				if(sp1.getGia() < sp2.getGia()) return -1;
				else if (sp1.getGia() == sp2.getGia()) return 0;
				else return 1;
			}
		});
	}
	public void timSanPhamTheoMaSP(String maSP, String tenSP, String cauHinh, String hangSX, float gia) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String m;
			System.out.print("-----------> Nhập mã nhân viên cần tìm : ");
			m = sc.nextLine();
			for (int i = 0; i < dssp.size(); i++) {
				if (dssp.get(i).getMaSP().equals(m)) {
					System.out.println("\t\t\t\t DANH SÁCH SẢN PHẨM");
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("%-6s%-15s%-36s%-35s%-16s%-19s\n", "| STT ", "| Mã Sản phẩm  |", "             Tên sản phẩm         |","              Cấu hình              |", " Hãng sản xuất |", "       Giá       |");		
						System.out.println(
								"|-----|--------------|----------------------------------|-------------------------------------|---------------|-----------------|");
						System.out.printf("%-6s%-15s%-35s%-38s%-16s%-18s%-1s\n", "|  " + i ,"|"+ dssp.get(i).getMaSP(),"|"+ dssp.get(i).getTenSP(),"|"+dssp.get(i).getCauHinh(),"|"+dssp.get(i).getHangSX(),"|"+dssp.get(i).getGia(),"|");
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

					}
					count++;
				}
			System.out.println(
					"================================= ĐÃ TÌM THẤY SẢN PHẨM  ================================");
			if (count == 0) {
				System.out.println("KHÔNG TÌM THẤY");
			}
	}
	public  void sua(String maSP, String tenSP, String cauHinh, String hangSX, float gia, int i) 
	{
				System.out.println(i);
				dssp.get(i).setMaSP(maSP);
				dssp.get(i).setTenSP(tenSP);
				dssp.get(i).setCauHinh(cauHinh);
				dssp.get(i).setHangSX(hangSX);
				dssp.get(i).setGia(gia);
	}
	
}

