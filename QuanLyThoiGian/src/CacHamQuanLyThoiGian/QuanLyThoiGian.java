package CacHamQuanLyThoiGian;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class QuanLyThoiGian {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Hàm System.currentTimeMillis() => trả về thời gian hiện tại
		System.out.println("Hàm System.currentTimeMillis() => trả về thời gian hiện tại");
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.print("Test ");
		}
		long t2 = System.currentTimeMillis();
		System.out.println("\n\nThời gian trươc khi chạy vòng for: " + t1 + " mls");
		System.out.println("Thời gian sau khi chạy vòng for: " + t2 + " mls");
		System.out.println("Thời gian để chạy vòng for: " + (t2 - t1) + " mls");
		System.out.println("Thời gian để chạy vòng for: " + (t2 - t1) / 1000 + " s");

		System.out.println("--------------------------------------------\n");
		// Hàm TimeUnit => đổi từ giờ sang giây, ngày sang giây, phút sang giờ, ....
		System.out.println("Hàm TimeUnit => đổi đơn vị thời gian");
		System.out.println("332003 ngày = " + TimeUnit.DAYS.toSeconds(332003) + " s");
		System.out.println("33 giờ = " + TimeUnit.HOURS.toMinutes(33) + " phút");

		// Date => lấy ra ngày tháng, năm
		// Nếu lấy ngày hiện tại thì tháng phải + 1, năm + 1900
		System.out.println("--------------------------------------------\n");
		System.out.println("Date => lấy ra ngày tháng, năm");
		Date d = new Date(System.currentTimeMillis());
		System.out.println("Nếu lấy ngày hiện tại thì tháng phải + 1, năm + 1900");
		System.out.println("Hôm nay là : " + d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));

		// Calendar
		System.out.println("--------------------------------------------\n");
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar để lấy ngày hiện tại:");
		System.out.println("Ngày hôm nay: " + c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-"
				+ c.get(Calendar.YEAR));

		// Hàm add(Calendar.(Date, Hour, Minute, Seconds,...), giờ) => tăng thêm bao
		// nhiêu ngày, giờ, phút, giây, ...
		System.out.println("--------------------------------------------\n");
		System.out.println(
				"Hàm add(Calendar.(Date, Hour, Minute, Seconds,...), giờ) => tăng thêm bao nhiêu ngày, giờ , phút, giây, ...");
		c.add(Calendar.DATE, 13);
		//	Calendar.HOUR_OF_DAY =>	lấy giờ hiện tại dưới định dạng 24h
		System.out.println("Ngày hôm nay: " + c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-"
				+ c.get(Calendar.YEAR));

		// Hàm SimpleDateFomat => định dạng ngày tháng, năm
		System.out.println("--------------------------------------------\n");
		System.out.println("Hàm SimpleDateFomat => định dạng ngày tháng, năm");
		DateFormat df = new SimpleDateFormat();
		// nếu không truyền gì vào trong fomat thì sẽ lấy fomat date mặc định
		System.out.println(df.format(d));
		
		df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(df.format(d));
		
	}

}
