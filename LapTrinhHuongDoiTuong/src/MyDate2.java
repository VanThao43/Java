
public class MyDate2 {
	private int day;
	private int month;
	private int year;
	
	public MyDate2(int d, int m, int y) {
			this.day = d;
			this.month = m;
			this.year = y;
	}
	
	public int getDay() {
		return this.day;
	}
	public void setDay(int d) {
		if (d>=1 && d<=31)
			this.day = d;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int m) {
		if (m<=12 && m>=1)
			this.month = m;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int y) {
		if(y>=1)
			this.year = y;
	}
	
	public static void main(String[] args) {
		MyDate2 md = new MyDate2(04, 03, 2003);
		System.out.println("Day = "+md.getDay());
		md.setDay(03);
		System.out.println("Day = "+md.getDay());
		System.out.println("\nMonth = "+md.getMonth());
		md.setMonth(03);
		System.out.println("Month = "+md.getMonth());
		System.out.println("\nYear = "+md.getYear());
		md.setYear(0);
		System.out.println("Year = "+md.getYear());
	}

}
