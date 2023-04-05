
public class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	public void printday() {
		System.out.println("Day: "+this.day);
	}
	public void printmonth() {
		System.out.println("Month: "+this.month);
	}
	public void printyear() {
		System.out.println("Year: "+this.year);
	}
	public void printDate() {
		System.out.println("Date: "+this.day +"/"+this.month+"/"+this.year);
	}
	
	public static void main(String[] args) {
		int d, m, y;
		MyDate md = new MyDate(04, 03, 2003);
		md.printday();
		md.printmonth();
		md.printyear();
		md.printDate();
	}
}
