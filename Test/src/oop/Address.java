package oop;


public class Address {
	public static final String STREETNAME = "No StreetName";
	public static final String DISTRICTNAME = "No DistrictName";
	public static final String CITYNAME = "No CityName";
	
	private String StreetName, CityName, DistrictName;
	
	
	// constructor đặc biệt loại 1
	public Address() {
		this(Address.STREETNAME, Address.DISTRICTNAME, Address.CITYNAME);
	}
	
	// Constructor đặc biệt loại 2
	public Address(String StreetName, String DistrictName, String CityName) {
		this.CityName = CityName;
		this.DistrictName = DistrictName;
		this.StreetName = StreetName;
	}
	
	// Constructor đặc biệt loại 3
	public Address (Address addr) {
		this(addr.getStreetName(), addr.getDistrictName(), addr.getCityName());
	}
	
	
	// Getter
	public String getCityName() {
		return this.CityName;
	}
	
	public String getDistrictName() {
		return this.DistrictName;
	}
	
	public String getStreetName() {
		return this.StreetName;
	}
	
	
	// Setter
	public Address setCityName(String CityName){
		this.CityName = CityName;
		return this;
	}
	
	public Address setStreetName(String StreetName) {
		this.StreetName = StreetName;
		return this;
	}
	
	public Address SetDistrictName(String DistrictName) {
		this.DistrictName = DistrictName;
		return this;
	}
	
	
	
	// to string
	public String toString() {
		return this.StreetName+", "+this.DistrictName + ", "+ this.CityName;
	}
	
	
	public static void main(String[] args) {
		Address addr = new Address("Trần Thái Tông", "Cầu Giấy", "Hà Nội");
		
		Address addr1 = new Address(addr);
		System.out.println(addr);
		
		
		System.out.println(addr1);
	}
	
}
