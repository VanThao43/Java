package TaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {

	public static void main(String[] args) {
		System.out.println("\n\t\t\t\t  CHÀO MỪNG BẠN ĐẾN VỚI TRÒ CHƠI TÀI XỈU !\n");
		Scanner sc = new Scanner(System.in);

		Locale lc = new Locale("en", "US");
		NumberFormat num = NumberFormat.getCurrencyInstance(lc);

		int x = 0;
		double taiKhoanCuaBan = 0;

		try {
			do {
				System.out.print("Bạn có thực sự muốn chơi? chọn [ 1 - yes hoặc 2 - no ] để tiếp tục: ");
				x = sc.nextInt();
				if (x == 2) {
					System.out.println("Bạn đã thoát trò chơi và hoàn tiền!");
					System.exit(0);
				} else if (x == 1) {
					System.out.print("\nNhập vào số tiền bạn muốn chơi: ");
					taiKhoanCuaBan = sc.nextDouble();
					System.out
							.println("----------Tài khoản hiện tại của bạn là: " + num.format(taiKhoanCuaBan) + "\n\n");
				}
			} while (x != 1 && x != 2);

		} catch (Exception e) {
			System.out.println("Bạn đã thoát trò chơi và hoàn tiền!");
			System.exit(0);
		}

		int luaChon = 0;
		do {
			System.out.println("\t\t\t\t-----------Xin mời nhập lựa chọn-----------");
			System.out.println("\t\t\t\t|                                         |");
			System.out.println("\t\t\t\t|       Chọn (1) để tiếp tục chơi.        |");
			System.out.println("\t\t\t\t|                                         |");
			System.out.println("\t\t\t\t|       Nhấn phìm bất kì để thoát.        |");
			System.out.println("\t\t\t\t|                                         |");
			System.out.println("\t\t\t\t-------------------------------------------");
			System.out.print("\nLựa chọn của bạn là: ");

			try {
				luaChon = sc.nextInt();
				if (luaChon != 1)
					System.out.println("Bạn đã thoát trò chơi!!");

			} catch (Exception e) {
				System.out.println("Bạn đã thoát trò chơi!!");
			}

			if (luaChon == 1) {

				System.out.println("\n\n*************** BẮT ĐẦU CHƠI ***************\n");
				if (taiKhoanCuaBan == 0) {
					System.out.println("Tài khoản của bạn là " + num.format(taiKhoanCuaBan) + " không thể chơi!");
					break;
				}

				System.out.println("\nBạn muốn cược bao nhiêu? ");

				double datCuoc = 0;
				do {
					System.out.print("*****Tiền đặt cược (0 <= tiền đặt <= số tiền trong tài khoản): ");
					datCuoc = sc.nextDouble();
				} while (datCuoc > taiKhoanCuaBan || datCuoc <= 0);

				System.out.println("-------------Bạn đã đặt cược: " + num.format(datCuoc) + "--------------");

				int luaChonTaiXiu = 0;
				System.out.println("\n\t\t\t\t---------------------------------------------");
				System.out.println("\t\t\t\t|                                           |");
				System.out.println("\t\t\t\t|  Lựa chọn:  (1) <=> Xỉu hoặc (2) <=> Tài  |");
				System.out.println("\t\t\t\t|                                           |");
				System.out.println("\t\t\t\t---------------------------------------------");
				do {
					System.out.print("Nhập lựa chọn của bạn: ");
					luaChonTaiXiu = sc.nextInt();
					if (luaChonTaiXiu == 1)
						System.out.println("-----Bạn đã chọn Xỉu.-----");
					else if (luaChonTaiXiu == 2)
						System.out.println("Bạn đã chọn Tài.");
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

				Random xucSac = new Random();
				int giaTri1 = xucSac.nextInt(6)+1;
				int giaTri2 = xucSac.nextInt(6)+1;
				int giaTri3 = xucSac.nextInt(6)+1;

				System.out.println("\n-----Kết quả sau khi tung: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
				int tong = giaTri1 + giaTri2 + giaTri3;

				if (tong == 3 || tong == 18) {
					System.out.println("\n-----Tổng là: " + tong + " => Nhà cái ăn hết, bạn đã thua cược!\n");
					taiKhoanCuaBan -= datCuoc;
					System.out.println("-----Tài khoản hiện tại của bạn là: " + num.format(taiKhoanCuaBan) + "\n\n");
				} else if (tong >= 4 && tong <= 10) {
					if (luaChonTaiXiu == 1) {
						System.out.println("\n-----Tổng là: " + tong + " - Xỉu => bạn đã thắng cược!\n");
						taiKhoanCuaBan += datCuoc;
						System.out
								.println("-----Tài khoản hiện tại của bạn là: " + num.format(taiKhoanCuaBan) + "\n\n");
					} else {
						System.out.println("\n-----Tổng là: " + tong + " - Xỉu => bạn đã thua cược!\n");
						taiKhoanCuaBan -= datCuoc;
						System.out
								.println("-----Tài khoản hiện tại của bạn là: " + num.format(taiKhoanCuaBan) + "\n\n");
					}
				} else {
					if (luaChonTaiXiu == 2) {
						System.out.println("\n-----Tổng là: " + tong + " - Tài => bạn đã thắng cược!\n");
						taiKhoanCuaBan += datCuoc;
						System.out
								.println("-----Tài khoản hiện tại của bạn là: " + num.format(taiKhoanCuaBan) + "\n\n");
					} else {
						System.out.println("\n-----Tổng là: " + tong + " - Tài => bạn đã thua cược!\n");
						taiKhoanCuaBan -= datCuoc;
						System.out
								.println("-----Tài khoản hiện tại của bạn là: " + num.format(taiKhoanCuaBan) + "\n\n");
					}
				}

				if (taiKhoanCuaBan == 0) {
					System.out.println("Tài khoản của bạn không còn tiền, không thể chơi tiếp!");
					break;
				}

				System.out.println("Xin mời tiếp tục!");

			}
		} while (luaChon == 1);

	}

}
