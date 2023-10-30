package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Emp {
	private String Name;
	private List<String> phones;
	
	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", phones=" + phones + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		System.out.println(phones instanceof ArrayList);
		System.out.println(phones instanceof LinkedList);
		
		this.phones = phones;
	}

}
