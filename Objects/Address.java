package Objects;

public class Address {
	public static final String STREETNAME = "No StreetName";
	public static final String DISTRICTNAME = "No DistrictName";
	public static final String CITYNAME = "No CityName";

	private String streetName, districtName, cityName;

	public Address() {
		this(Address.STREETNAME, Address.DISTRICTNAME, Address.CITYNAME);
	}

	public Address(String streetName, String districtName, String cityName) {
		this.streetName = streetName;
		this.districtName = districtName;
		this.cityName = cityName;
	}
	
	public Address(Address addr) {
		this(addr.getStreetName(), addr.getDistrictName(), addr.getCityName());
	}

	public String getStreetName() {
		return this.streetName;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public String getCityName() {
		return this.cityName;
	}

	public Address setStreetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	public Address setDistrictName(String districtName) {
		this.districtName = districtName;
		return this;
	}

	public Address setCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}
	
	public String toString() {
		return this.streetName + ", " + this.districtName + ", " + this.cityName;
	}
	
	public static void main(String[] args) {
		Address addr1 = new Address("Tran Thai Tong", "Cau Giay", "Ha Noi");
		System.out.println(addr1);
		
		Address addr2 = new Address(addr1);
		System.out.println(addr2);
	}
	
	
}
