package oop;

public class Person {
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE = 0;
	public static final Address ADDRESS = new Address();
	
	private String firstName, lastName;
	private byte age;
	private Address address;
	
	public Person() {
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
	}
	
	public Person(String firstName, String lastName, byte age, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
		if (address == null)
			this.address = address;
		else
			this.address = new Address(address);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public byte getAge() {
		return this.age;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Person setAge(byte age) {
		this.age = age;
		return this;
	}
	
	public Person setAddress(Address address) {
		this.address = address;
		return this;
	}
	
	
	@Override
	public String toString() {
		return this.firstName+" "+this.lastName+", "+this.age+"\n"+this.address;
	}

	public static void main(String[] args) {
		Address addr = new Address();
		addr.setCityName("Hà Nội").SetDistrictName("Cầu Giấy").setStreetName("Trần Thái Tông");
		Person p1 = new Person("Nguyễn", "Văn Thao", (byte)20, addr);
		
		System.out.println(p1);
	}
}
