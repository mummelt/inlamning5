package onsdag;

import java.util.*;

public class PersonRegister {
	private ArrayList<Person> persons = new ArrayList<Person>();

	public void setPersons (ArrayList<Person> newPersons) {
		this.persons = newPersons;
	}
	public ArrayList <Person> getPersons (){
		return persons;
	}
		
	public void addPerson(Person newPerson) {
		this.persons.add(newPerson);
	}

	public Person findPerson(String pNbr) {
		for (Person p : persons) {
			if (p.getPNbr().equals(pNbr)) {
				return p;
			}
		}
		return null;
	}

	public Person removePerson(String pNbr) {
		Person temp = findPerson(pNbr);
			if (temp != null) {
			this.persons.remove(temp);
		}
		return null;
	}
}
