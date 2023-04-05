package Objects;

import java.util.*;

public interface BTTU extends CTX, CTH, GDS{
	public List<Person> getAll();
	public List<Person> getPersons(Address addr);
	
	public ArrayList<Person> getName();
	public ArrayList<Person> getName(Address addr);
	
	public HashMap<Integer, Person> getPossitions();
	public HashMap<Integer, Person> getPossitions(Address addr);
}
