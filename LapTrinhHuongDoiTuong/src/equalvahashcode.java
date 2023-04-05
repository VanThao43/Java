import java.util.Objects;

public class equalvahashcode {
	private int day;
	private int month;
	private int year;
	
	public equalvahashcode(int d, int m, int y) {
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
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		equalvahashcode other = (equalvahashcode) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	@Override
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year;
	}

	public static void main(String[] args) {
		equalvahashcode md1 = new equalvahashcode(03, 03, 2003);
		equalvahashcode md2 = new equalvahashcode(10, 04, 2002);
		equalvahashcode md3 = new equalvahashcode(03, 03, 2003);
		
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		
		System.out.println("md1 = md3: "+md1.equals(md3));
		System.out.println("md1 = md2: "+md1.equals(md2));
		
		System.out.println("Hashcode md1: "+md1.hashCode());
		System.out.println("Hashcode md2: "+md2.hashCode());
		System.out.println("Hashcode md3: "+md3.hashCode());
	}
}
