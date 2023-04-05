package Objects;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address("Trần Thái Tông", "Cầu Giấy", "Hà Nội");

		Person s = new Student("Nguyễn Văn", "B", (byte) 20, addr, 892, "CNTT");
		Employee e = new Employee("Nguyễn", "Văn A", (byte) 30, addr, 200, "Giám đốc");

		Manager sm = new StudentManager();
		Manager em = new EmployManager();

		System.out.println(sm.getDetails(s));
		System.out.println(em.getDetails(e));
	}

}
