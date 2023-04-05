package oop;

public class Address {
	// Constants - 1

	public static final String CITYNAME = "No cityName";
	public static final String DISTRICTNAME = "No districtName";
	public static final String STREETNAME = "No streetName";

	// Object's Properties - 0
	private String cityName;
	private String districtName;
	private String streetName;

	// Constructor method - 2
	public Address() {
		this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
	}

	public Address(String cityName, String districtName, String streetName) {
		this.cityName = cityName;
		this.districtName = districtName;
		this.streetName = streetName;
	}

	public Address(Address addr) {
		// Đặc biệt loại 3 - sao chép thông tin của đối tượng cho nhau mà khác vùng nhớ

		this(addr.getCityName(), addr.getDistrictName(), addr.getStreetName());
//		this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);

	}

	// Getter Method - 3
	public String getCityName() {
		return this.cityName;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public String getStreetName() {
		return this.streetName;
	}

	// Setter Method - 4
	public Address setCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}

	public Address setDistrictName(String districtName) {
		this.districtName = districtName;
		return this;
	}

	public Address setStreetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	// Other Method - 5
	public String toString() {
		return this.streetName + ", " + this.districtName + ", " + this.cityName;
	}

	protected void finalize() throws Throwable {

	}

	public static void main(String[] args) {
		Address a1 = new Address("Hà Nội", "Cầu Giấy", "Trần Thái Tông");
		System.out.println(a1);

		// a1, b1 hoàn toàn độc lập nhau nên 1 đối tượng thay đổi thì k ảnh hưởng đến
		// đối tượng còn lại
		Address b1 = new Address(a1);

		System.out.println(b1);
	}
}
