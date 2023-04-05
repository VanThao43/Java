package Objects;

public abstract class Manager {
	public abstract String getInFor(Person p);
	
	public String getDetails(Person p) {
		return this.getInFor(p);
	}
}	
