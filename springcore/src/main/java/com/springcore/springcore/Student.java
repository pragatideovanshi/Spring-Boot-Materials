package com.springcore.springcore;

public class Student {
	private int studentId;
	private String Name;
	private String Address;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		System.out.println("Setting NAme");
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Student(int studentId, String name, String address) {
		super();
		this.studentId = studentId;
		Name = name;
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", Name=" + Name + ", Address=" + Address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
