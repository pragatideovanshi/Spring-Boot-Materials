package StudentManagement;

public class student {
	private int ID;
	private String Name;
	private String City;
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
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int iD, String name, String city, int age) {
		super();
		ID = iD;
		Name = name;
		City = city;
		Age = age;
	}
	public student( String name, String city, int age) {
		super();
		Name = name;
		City = city;
		Age = age;
	}
	@Override
	public String toString() {
		return "student [ID=" + ID + ", Name=" + Name + ", City=" + City + ", Age=" + Age + "]";
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

}
