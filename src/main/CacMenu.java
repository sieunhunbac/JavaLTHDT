package main;
import java.util.*;
import lop.NhanVien;
import lop.KhachHang;
import lop.QuanLyNhanVien;
import lop.QuanLyKhachHang;
import lop.SanPham;
import lop.QuanLySanPham;
public class CacMenu {
	Scanner sc = new Scanner(System.in);
	QuanLyNhanVien nvobj = new QuanLyNhanVien();
	QuanLyKhachHang khobj = new QuanLyKhachHang();
	QuanLySanPham spobj = new QuanLySanPham();
	int n;
		// TODO Auto-generated method stub
		
	public void menuNV() {
		int chon1;
		do {
			System.out.println("\t\t\t\t\t\t----------------------------------MENU QUẢN LÝ NHÂN VIÊN --------------------------------");
			System.out.println("\t\t\t\t\t\t|(1): NHẬP thông tin nhân viên                                                          |");
			System.out.println("\t\t\t\t\t\t|(2): HIỂN THỊ danh sách nhân viên                                                      |");
			System.out.println("\t\t\t\t\t\t|(3): Tính TỔNG LƯƠNG nhân viên                                                         |");
			System.out.println("\t\t\t\t\t\t|(4): THÊM nhân viên mới vào danh sách                                                  |");
			System.out.println("\t\t\t\t\t\t|(5): XÓA nhân viên khỏi danh sách theo Mã nhân viên                                    |");
			System.out.println("\t\t\t\t\t\t|(6): Sắp xếp nhân viên theo tổng lương                                                 |");
			System.out.println("\t\t\t\t\t\t|(7): SỬA thông tin cho nhân viên                                                       |");
			System.out.println("\t\t\t\t\t\t|(8): TÌM KIẾM nhân viên theo mã                                                        |");
			System.out.println("\t\t\t\t\t\t|(9): Thoát khỏi chương trình                                                           |");
			System.out.println("\t\t\t\t\t\t-----------------------------------------------------------------------------------------");
			System.out.print("\t\t\t\t\t\t--->Mời nhập lựa chọn : ");
			chon1 = sc.nextInt();
			switch(chon1)
			{
			case 1:{
				nvobj.nhap();break;
			}
			case 2:{
				nvobj.display();break;
			}
			case 3:{
				nvobj.tongLuong();break;
			}
			case 4:{
				System.out.print("Nhập số lượng nhân viên cần chèn: ");
				n =sc.nextInt();
				sc.nextLine();
				try {
					for( int i=0; i<n;i++) {
						System.out.println("\t\t\t\t\t\t\t |");
						System.out.println("\t\t\t\t\t\t\t |");
						System.out.println("\t\t\t\t\t\t\t |");
						System.out.println("\t\t\t\t\t\t\t V");
						System.out.println("******************NHẬP DỮ LIỆU CHO NHÂN VIÊN CẦN CHÈN ******************");
						System.out.print("|Nhập mã nhân viên ");
						String MaNV = sc.next();
						System.out.print("|Nhập HỌ nhân viên :");
						String Ho = sc.next();
						System.out.print("|Nhập TÊN ĐỆM nhân viên :");
						String Tendem = sc.next();
						System.out.print("|Nhập TÊN nhân viên :");
						String Ten = sc.next();
						System.out.print("|Nhập NGÀY SINH của nhân viên :");
						int NgaySinh = sc.nextInt();
						System.out.print("|Nhập THÁNG SINH của nhân viên :");
						int ThangSinh = sc.nextInt();
						System.out.print("|Nhập NĂM SINH của nhân viên :");
						int NamSinh = sc.nextInt();
						System.out.print("|Nhập Gioi Tinh của nhân viên :");
						String GioiTinh = sc.next();
						System.out.print("|Nhập SDT của nhân viên :");
						int Sdt = sc.nextInt();
						System.out.print("|Nhập mức lương :");
						int MucLuong = sc.nextInt();
						System.out.print("|Nhập số giờ làm :");
						int SoGioLam = sc.nextInt();
						int TongLuong = 0;
						NhanVien tam = new NhanVien (MaNV, Ho,Tendem,Ten,NgaySinh,ThangSinh,NamSinh,GioiTinh,Sdt, 
								MucLuong, SoGioLam, TongLuong);
						System.out.println("Nhập vị trí cần chèn: ");
						int vt = sc.nextInt();
						nvobj.chen(tam, vt);
						
						System.out.println("*********************************************************************");
					}}catch (Exception e) {
						System.out.println("!!!ĐÃ XẢY RA LỖI TRONG QUÁ TRÌNH NHẬP DỮ LIỆU!!!");
					}
				break;}
			case 5: {
				System.out.println("Nhập mã nhân viên cần xóa: ");
				sc.nextLine();
				String MaNV = sc.nextLine();
				nvobj.xoa(MaNV);
				System.out.println("****Xóa nhân viên có MaNV: "+MaNV +"Thành công****" );
				break;
			}
			case 6:{
				nvobj.sapxep();
				System.out.println("Danh sách nhân viên sau khi đã sắp xếp Theo tổng lương");
				nvobj.display();
			break;}
			case 7:{
				System.out.println("Nhập mã nhân viên cần sửa: ");
				String maNV = sc.next();
				maNV = nvobj.checkmanv(maNV);
				int i = 0;
				System.out.println(i);
				if(i == -1) {
					System.out.println("Không tìm thấy Nhân viên ");
				}else {
				System.out.print("|Nhập HỌ nhân viên :");
				String ho = sc.next();
				System.out.print("|Nhập TÊN ĐỆM nhân viên :");
				String tendem = sc.next();
				System.out.print("|Nhập TÊN nhân viên :");
				String ten = sc.next();
				System.out.print("|Nhập NGÀY SINH của nhân viên :");
				int ngaysinh = sc.nextInt();
				System.out.print("|Nhập THÁNG SINH của nhân viên :");
				int thangsinh = sc.nextInt();
				System.out.print("|Nhập NĂM SINH của nhân viên :");
				int namsinh = sc.nextInt();
				System.out.print("|Nhập Gioi Tinh của nhân viên :");
				String gioitinh = sc.next();
				System.out.print("|Nhập SDT của nhân viên :");
				int sdt = sc.nextInt();
				System.out.print("|Nhập mức lương :");
				int mucLuong = sc.nextInt();
				System.out.print("|Nhập số giờ làm :");
				int soGioLam = sc.nextInt();
				int TongLuong = 0;
				nvobj.sua(maNV, ho, tendem, ten, ngaysinh, thangsinh, namsinh, gioitinh, sdt, mucLuong, soGioLam, TongLuong, i);
				System.out.println("***************Kết quả sau khi sửa***************");
				nvobj.display();
				}
			break;}
			case 8: {
				nvobj.timNhanvienTheoTen(null, null, null, null, chon1, chon1, chon1, null, chon1, chon1, chon1, chon1);
			}
		default:break;
		}
		}while (chon1 <9); System.out.println("ĐÃ THOÁT KHỎI CHƯƠNG TRÌNH");
	}
	
// KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH KH 
	public void menuKH() {
		int chon2;
		do {
			System.out.println("----------------------------------MENU QUẢN LÝ KHÁCH HÀNG -------------------------------");
			System.out.println("|(1): NHẬP thông tin khách hàng                                                         |");
			System.out.println("|(2): HIỂN THỊ danh sách khách hàng                                                     |");
			System.out.println("|(3): THÊM khách hàng mới vào danh sách                                                 |");
			System.out.println("|(4): XÓA khách hàng khỏi danh sách theo Mã khách hàng                                  |");
			System.out.println("|(5): SỬA thông tin cho khách hàng                                                      |");
			System.out.println("|(6): TÌM KIẾM khách hàng theo mã                                                       |");
			System.out.println("|(7): Thoát khỏi chương trình                                                           |");
			System.out.println("-----------------------------------------------------------------------------------------");
			chon2 = sc.nextInt();
			switch(chon2)
			{
			case 1:{
				khobj.nhap();break;
			}
			case 2:{
				khobj.display();break;
			}
			case 3:{
				System.out.print("Nhập số lượng khách hàng cần chèn: ");
				n =sc.nextInt();
				sc.nextLine();
				try {
					for( int i=0; i<n;i++) {
						System.out.println("\t\t\t\t\t |");
						System.out.println("\t\t\t\t\t |");
						System.out.println("\t\t\t\t\t |");
						System.out.println("\t\t\t\t\t V");
						System.out.println("******************NHẬP DỮ LIỆU CHO KHÁCH HÀNG CẦN CHÈN ******************");
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
						System.out.print("|Nhập Mã SP "+i+" :");
						String MaSP = sc.next();
						KhachHang tam = new KhachHang (MaKH, Ho,Tendem,Ten,NgaySinh,ThangSinh,NamSinh,GioiTinh,Sdt, 
								DiaChi,Email,MaSP);
						System.out.println("Nhập vị trí cần chèn: ");
						int vt1 = sc.nextInt();
						khobj.chen(tam, vt1);
						
						System.out.println("*********************************************************************");
					}}catch (Exception e) {
						System.out.println("!!!ĐÃ XẢY RA LỖI TRONG QUÁ TRÌNH NHẬP DỮ LIỆU!!!");
					}
				break;}
			case 4: {
				System.out.println("Nhập mã khách hàng cần xóa: ");
				String MaKH = sc.next();
				khobj.xoa(MaKH);
				System.out.println("****Xóa khách hàng có MaKH: "+MaKH +"Thành công****" );
				break;
			}
			case 5:{
				System.out.println("Nhập mã khách hàng cần sửa: ");
				String maKH = sc.next();
				maKH = nvobj.checkmanv(maKH);
				int i = 0;
				System.out.println(i);
				if(i == -1) {
					System.out.println("Không tìm thấy khách hàng ");
				}else {
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
					khobj.sua(maKH, Ho, Tendem, Ten, NgaySinh, ThangSinh, NamSinh, GioiTinh, Sdt, DiaChi, Email, i);
				System.out.println("***************Kết quả sau khi sửa***************");
				nvobj.display();
				}
			break;}
			case 6: {
				khobj.timNhanvienTheoTen(null, null, null, null, chon2, chon2, chon2, null, chon2, null, null);
			break;}
			case 7:{
				khobj.hienthiSP();
			}
		default:break;
		}
		}while (chon2 <8); System.out.println("ĐÃ THOÁT KHỎI CHƯƠNG TRÌNH");
	}
//Menu SP SP SP	SP SP SP	SP SP SP	SP SP SP	SP SP SP	SP SP SP	
	public void menuSP() {
		
		int chon3;
		do {
			System.out.println("----------------------------------MENU QUẢN LÝ SẢN PHẨM --------------------------------");
			System.out.println("|(1): NHẬP thông tin sản phẩm                                                          |");
			System.out.println("|(2): HIỂN THỊ danh sách sản phẩm                                                      |");
			System.out.println("|(3): Hiển thị theo hãng sản xuất                                                      |");
			System.out.println("|(4): Thêm sản phẩm mới vào danh sách                                                  |");
			System.out.println("|(5): XÓA sản phẩm khỏi danh sách                                                      |");
			System.out.println("|(6): Sắp xếp nhân viên theo giá sản phẩm                                              |");
			System.out.println("|(7): TÌM KIẾM nhân viên theo mã sản phẩm                                              |");
			System.out.println("|(8): SỬA thông tin cho nhân viên                                                      |");
			System.out.println("|(9): Thoát khỏi chương trình                                                          |");
			System.out.println("-----------------------------------------------------------------------------------------");
			chon3 = sc.nextInt();
			switch(chon3)
			{
			case 1:{
				spobj.khoiTao();break;
			}
			case 2: {
				spobj.hienthi();break;
			}
			case 3:{
				System.out.println("Nhập hãng sản xuất cần hiển thị: ");
				String hangsx = sc.next(); spobj.hienThidk(hangsx);break;
			}
			case 4:{
				int i = 0;
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
				System.out.println("Nhap vi tri can chen:");
				int vt = sc.nextInt();
				spobj.chen(tam, vt);
				spobj.hienthi();
			break;}
			case 5 :{
				System.out.println("Nhập mã sản phẩm cần xóa ");
				 String MaSP = sc.next();
				spobj.xoa(MaSP); spobj.hienthi();break;
			}
			case 6 :{
				spobj.sapxep();
				System.out.println("***Sắp xếp thành công***");
			}
			case 7 :{
				spobj.timSanPhamTheoMaSP(null, null, null, null, chon3);
			}
			default:break;
			case 8:{
				int i;
				System.out.println("Nhập mã sản phẩm cần sửa: ");
				String MaSP = sc.next();
				System.out.print("|Nhập TÊN sản phẩm  :");
				String TenSP = sc.next();
				System.out.print("|Nhập Cấu hình sản phẩm  :");
				String CauHinh = sc.next();
				System.out.print("|Nhập HÃNG sản xuất sản phẩm  :");
				String HangSX = sc.next();
				System.out.print("|Nhập Giá sản phẩm  :");
				float Gia = sc.nextInt();
				SanPham tam = new SanPham (MaSP, TenSP, CauHinh, HangSX, Gia);
				i = 0; 
				MaSP = nvobj.checkmanv(MaSP);
				System.out.println(i);
				if(i == -1) {
					System.out.println("Không tìm thấy Sản phẩm ");
				}else {
				spobj.sua(MaSP, TenSP, CauHinh, HangSX, Gia, i);
				System.out.println("***************Kết quả sau khi sửa***************");
				spobj.hienthi();
				}
			}
	}}while(chon3 < 9);
	}
	
}
