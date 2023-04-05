package Objects;

public class Student extends Person {

	// constants
	public static final int STUDENT_ID = 0;
	public static final String STUDENT_SPECIALY = "None";

	// Student's properties
	private int student_id;
	private String student_specialy;

	public Student() {
		this(Student.FIRSTNAME, Student.LASTNAME, Student.AGE, Student.ADDRESS, Student.STUDENT_ID,
				Student.STUDENT_SPECIALY);
	}

	public Student(String firstName, String lastName, byte age, Address address, int student_id,
			String student_specialy) {

		// khởi tạo thành công lớp cha(Person)
		super(firstName, lastName, age, address);

		// Gán giá trị cho các thuộc tính lớp con(Student)
		this.student_id = student_id;
		this.student_specialy = student_specialy;
	}

	// Getter methods
	public int getStudent_id() {
		return this.student_id;
	}

	public String getStudent_specialy() {
		return this.student_specialy;
	}

	// Setter methods
	public Student setStudent_id(int student_id) {
		this.student_id = student_id;
		return this;
	}

	public Student setStudent_specialy(String student_specialy) {
		this.student_specialy = student_specialy;
		return this;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + " - SI=" + student_id + ", SS=" + student_specialy + "]";
	}

	public static void main(String[] args) {
		
	}

}
