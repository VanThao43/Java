package Objects;

public class StudentManager extends Manager {

	@Override
	public String getInFor(Person p) {
		return "SM - "+p.toString();
	}

}
