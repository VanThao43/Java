
public class MyDate3 {
	private int day;
	private int month;
	private int year;
	public MyDate3(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
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
	public void setMonth(int month) {
		if (month>=1 && month <=12)
			this.month = month;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		if (year>=1)
			this.year = year;
	}
	@Override
	public String toString() {
		return this.day + "/" +this.month + "/"+this.year;
	}
	
	public static void main(String[] args) {
		MyDate3 md1 = new MyDate3(04, 03, 2003);
		md1.setDay(03);
		md1.setMonth(55);
		md1.setYear(0);
		System.out.println("dd/mm/yyy: "+md1);
	}
	
	
}
