package Objects;

public class TestPerson {

	public static void main(String[] args) {
		Address addr = new Address("Trần Thái Tông", "Cầu Giấy", "Hà Nội");
		
		Person s = new Student("Nguyễn Văn", "B", (byte) 20, addr, 892, "CNTT");
		Employee e1 = new Employee("Nguyễn", "Văn A", (byte) 30, addr, 200, "Giám đốc");
		
		System.out.println(s.toString());
		System.out.println(e1);
	}

}
