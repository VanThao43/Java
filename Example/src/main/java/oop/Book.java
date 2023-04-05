package oop;

public class Book {
	public static final short BOOK_ID = 0;
	public static final String BOOK_TITLE = "No book_title";
	public static final String BOOK_SUMMARY = "No book_summary";
	public static final String BOOK_URL = "No book_url";
	public static final byte BOOK_FILE_TYPE = 0;
	public static final Person BOOK_AUTHOR = new Person();
	public static final Address BOOK_PUBLISHER_ADDRESS = new Address();
	public static final String PUBLISHER_NAME = "No publisher_name";
	public static final double BOOK_PRICE = 0;
	public static final String BOOK_CREATED_DATE = "No book_created_date";
	
	
	private short book_id;	// Mã sách
	private String book_title;	// Tiêu đề sách
	private String book_summary;	//Tóm tắt
	private String book_url;	// Đường dẫn tải về
	private byte book_file_type;	// Kiểu tệp tin
	private Person book_author; //	Tên tác giả
	private Address book_publisher_address;	// Địa chỉ nhà xuất bản
	private String publisher_name;	//Tên nhà xuất bản
	private double book_price;	// Giá tiền
	private String book_created_date; // Ngày sản xuất
	
	public Book() {
		this(Book.BOOK_ID, Book.BOOK_TITLE, Book.BOOK_SUMMARY, Book.BOOK_URL, Book.BOOK_FILE_TYPE, Book.BOOK_AUTHOR, Book.BOOK_PUBLISHER_ADDRESS, Book.PUBLISHER_NAME, Book.BOOK_PRICE, Book.BOOK_CREATED_DATE);
	}
	
	public Book(short book_id, String book_title, String book_summary, String book_url, byte book_file_type, Person book_author, Address book_publisher_address, String publisher_name, double book_price, String book_created_date) {
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_summary = book_summary;
		this.book_url = book_url;
		this.book_file_type = book_file_type;
		this.book_author = book_author;
		
		if (book_publisher_address == null)
			this.book_publisher_address = book_publisher_address;
		else
			this.book_publisher_address = new Address(book_publisher_address);
		
		this.publisher_name = publisher_name;
		this.book_price = book_price;
		this.book_created_date = book_created_date;
	}
	
	
	
	
	
	
	
	// GETTER
	public short getBook_id() {
		return this.book_id;
	}
	
	public String getBook_title() {
		return this.book_title;
	}
	
	public String getBook_summary() {
		return this.book_summary;
	}
	
	public String get_Book_url() {
		return this.book_url;
	}
	
	public byte getBook_file_type() {
		return this.book_file_type;
	}
	
	public Person getBook_author() {
		return this.book_author;
	}
	
	public Address getBook_publisher_address() {
		return this.book_publisher_address;
	}
	
	public String getPublisher_name() {
		return this.publisher_name;
	}
	
	public double getBook_price() {
		return this.book_price;
	}
	
	public String getBook_created_date() {
		return this.book_created_date;
	}
	
	
	
	
	
	
	// 	SETTER
	public Book setBook_id(short book_id) {
		this.book_id = book_id;
		return this;
	}
	
	public Book setBook_title(String book_title) {
		this.book_title = book_title;
		return this;
	}
	
	public Book setBook_summary() {
		this.book_summary = book_summary;
		return this;
	}
	
	public Book setBook_url(String book_url) {
		this.book_url = book_url;
		return this;
	}
	
	public Book setBook_file_type(byte book_file_type) {
		this.book_file_type = book_file_type;
		return this;
	}
	
	public Book setBook_author(Person book_author) {
		this.book_author = book_author;
		return this;
	}
	
	public Book setBook_publisher_address(Address book_publisher_address) {
		this.book_publisher_address = book_publisher_address;
		return this;
	}
	
	public  Book setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
		return this;
	}
	
	public Book setBook_price(double book_price) {
		this.book_price = book_price;
		return this;
	}
	
	public Book setBook_created_date(String book_created_date) {
		this.book_created_date = book_created_date;
		return this;
	}

	
	
	
	
	
	// OTHER METHOD
	public String toString() {
		return  "ID sách: "+book_id + "\nTên sách: " + book_title + "\nTóm tắt: " + book_summary
				+ "\nLink sách: " + book_url + "\nKiểu file sách số: " + book_file_type + "\nTác giả: " + book_author.toString()
				+ "\nĐịa chỉ nhà xuất bản: " + book_publisher_address.toString() + "\nTên nhà xuất bản: " + publisher_name
				+ "\nGiá tiền: " + book_price + "đ \nNgày xuất bản: " + book_created_date;
	}
	
	
	
	
	public static void main(String[] args) {
		Book b = new Book((short)218, "Doraemon", "Các bảo bối thần kì của Doraemon", "https://www.Doraemon", (byte)100, 
				new Person(), new Address("Hà Nội", "Cầu Giấy", "Xuân Thuỷ"), "Kim Đồng", 35000, "04/03/2003");
		
		
		System.out.println(b);
	}
	
	
	
	
	
	
}
