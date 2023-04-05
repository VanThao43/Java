package Objects;

public class Employee extends Person {
	// Constant
	public static final int NET = 0;
	public static final String POSITION = "No Position";

	// Properties
	private int net;
	private String position;

	
	// Constructor
	public Employee() {
		this(Employee.FIRSTNAME, Employee.LASTNAME, Employee.AGE, Employee.ADDRESS, Employee.NET, Employee.POSITION);
	}

	public Employee(String firstName, String lastName, byte age, Address address, int net, String position) {
		super(firstName, lastName, age, address);
		this.net = net;
		this.position = position;
	}
	
	
	// Getter
	public int getNet() {
		return this.net;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	
	
	// Setter
	public Employee setNet(int net) {
		this.net = net;
		return this;
	}
	
	public Employee setPosition(String position) {
		this.position = position;
		return this;
	}
	
	
	// to String
	public String toString() {
		return "Employee: [" + super.toString() + " - Net: " + this.net + ", Position: " + this.position + "]";
	}
	
	public static void main(String[] args) {
		
	}
}
