package oop;


/**
 * Lớp đối tượng mô tả thông tin về con người (POJO)
 * 
 * Lớp mô tả đối tượng trong cơ sở dữ liệu - Persistent Class (tập trung vào các thuộc tính)
 * @author thaopc
 *
 */
public class Person {
	// Constants
	public static final String FIRSTNAME = "No firstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE = 0;
	public static final Address ADDRESS = new Address();

	// Classes Variables
	private static int count = 0; // đêm số đối tượng được tạo ra trong bộ nhớ

	// Object's Properties: danh sách thuộc tính đối tượng
	private String lastName, firstName;
	private byte age;

	// Địa chỉ sinh sống của con người
	private Address address;

	// Constructor Method : Các phương thức Constructor
	// Phương thức khởi tạo đối tượng và thiết lập các giá trị ban đầu cho các thuộc
	// tính

	public Person() {
		// Đặc biệt loại 1
		this.firstName = "No FirstName";
		this.lastName = "No lastName";
		this.age = 0;

//		this("No FirstName", "No LastName", (byte)0);

//		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);

	}

	public Person(byte age) {
//		this.firstName = "No FirstName";
//		this.lastName = "No lastName";
//		this.age = age;

//		this("No FirstName", "No LastName", age);

		this(Person.FIRSTNAME, Person.LASTNAME, age, Person.ADDRESS);
	}

	public Person(String firstName, String lastName, byte age, Address address) {
		// Đặc biệt loại 2
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;

		if (address == null)
			this.address = address; // cách b1
		else
			this.address = new Address(address); // cách b2

		// Tăng biến đếm đối tượng
		Person.count++;
	}

	// Getter Method => Các phương thức lấy giá trị của thuộc tính
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

	// Setter Method: Các phương thức thiết lập giá trị cho thuộc tính
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

	public Person setAddress(String cityName, String districtName, String streetName) {
		this.address = new Address(cityName, districtName, streetName);
		return this;
	}

	// Other method
	public String toString() {
		return this.lastName + " " + this.firstName + " - " + this.age + 
				"\n" + this.address;
	}

	/**
	 * Phương thức lấy về số đối tượng được tạo ra trong bộ nhớ
	 * 
	 * @return
	 */
	public static int getCountPerson() {
		return Person.count;
	}

	// Phương thức dọn dẹp đối tượng, tạm thời chưa dùng đến
	protected void finalize() throws Throwable {
		// Giảm số đối tượng được tạo ra trong bộ nhớ
		Person.count--;
	}

	public static void main(String[] args) {
		// Tạo đối tượng
		// Nguyên tắc A a = new A();

		Person p; // Khai báo đối tượng, chưa tồn tại trong bộ nhớ
		Person p1 = new Person(); // Dùng constructor số 1
		Person p2 = new Person((byte) 14); // dùng constructor số 2
		Person p3 = new Person("Thao", "Nguyễn Văn", (byte) 20, new Address("Nhân Bình", "Lý Nhân", "Hà Nam")); // Dùng constructor số 3

		// Bổ sung địa chỉ cho p3
		p3.setAddress("Hà Nam", "Lý Nhân", "Nhân Bình");

		System.out.println(p3.toString());
//		System.out.println(p1);	//không có .toString cũng ok, java tự tìm
//		System.out.println(p2);

		// Bổ sung thông tin cho p1
//		p1.setFirstName("ka");
//		p1.setLastName("Linh");		Quá tốn thời gian
//		p1.setAge((byte)20);

		p1.setFirstName("Linh").setLastName("Trần Phương").setAge((byte) 20).setAddress("Hà Nội", "Cầu Giấy", "Trần Thái Tông");
		System.out.println("\n"+p1);

		System.out.println("\nSố đối tượng được tạo ra là: " + Person.getCountPerson());
	}
}
