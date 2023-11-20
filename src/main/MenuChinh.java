package main;
import java.io.IOException;
import java.util.*;
public class MenuChinh {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CacMenu menu = new CacMenu();
		Scanner sc = new Scanner(System.in);
		int chon;	
		do {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t\t------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t||--------------------------------------(o)---------------------------------------||");
		System.out.println("\t\t\t\t\t\t\t||     ______________________________________________________________________     ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                 CHƯƠNG TRÌNH QUẢN LÝ CỦA HÀNG BÁN LAPTOP             |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");		
		System.out.println("\t\t\t\t\t\t\t||    |                 (1): Làm việc với nhân viên                          |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                 (2): Làm việc với khách hàng                         |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                 (3): Làm việc với sản phẩm                           |    ||");;
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                  ------>>Mời nhập lựa chọn<<------                   |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |                                                                      |    ||");
		System.out.println("\t\t\t\t\t\t\t||    |______________________________________________________________________|    ||");
		System.out.println("\t\t\t\t\t\t\t||                                                                                ||");
		System.out.println("\t\t\t\t\t\t\t||--------------------------------------------------------------------------------||");
		System.out.println("\t\t\t\t\t\t\t/__________________________________________________________________________________\\");
		System.out.println("                                                       //                                                                                  \\\\");
		System.out.println("                                                      //      //=====================================================================\\\\     \\\\");
		System.out.println("                                                     //      //    /     /     /     /     /     /    /     /     /     /     /    /  \\\\     \\\\");
		System.out.println("                                                    //      //----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----  \\\\     \\\\");
		System.out.println("                                                   //      //    /     /     /     /     /     /    /     /     /     /     /     /     \\\\     \\\\");
		System.out.println("                                                  //      //----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----\\\\     \\\\");
		System.out.println("                                                 //      //    /     /     /     /     /     /    /     /     /     /     /     /    /    \\\\     \\\\");
		System.out.println("                                                //      //----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----    \\\\     \\\\");
		System.out.println("                                               //      //    /     /     /     /     /     /    /     /     /     /     /     /     /       \\\\     \\\\");
		System.out.println("                                              //      //=====================================================================================\\\\     \\\\");
		System.out.println("                                             //                                                                                                      \\\\");
		System.out.println("                                            //________________________________________________________________________________________________________\\\\");
		System.out.println("                                           //__________________________________________________________________________________________________________\\\\");
			chon = sc.nextInt();
			switch(chon)
			{
			case 1: {
				menu.menuNV();break;
			}
			case 2: {
				menu.menuKH();
				break;
			}
			case 3:{
				menu.menuSP();
				break;
			}}
			}while(chon<4);
	}
}
