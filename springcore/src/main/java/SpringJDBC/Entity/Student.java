package SpringJDBC.Entity;

public class Student {
	
	private int ID;
	private String Name;
	private String city;
	private int Age;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Student(int iD, String name, String city, int age) {
		super();
		ID = iD;
		Name = name;
		this.city = city;
		Age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", city=" + city + ", Age=" + Age + "]";
	}
	

}
