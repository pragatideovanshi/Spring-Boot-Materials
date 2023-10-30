package com.HibernateSQLSERVER.ProjectSQLSERRVER;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Orders") // One Error was coming thats why added
public class Order {
	
    @Id
	private int ID;
    
	private String Name;
	
	private String Description;
	
	private String Orderby;
	
	private int Price;
	
	public int getID() {
		return ID;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int iD, String name, String description, String orderby, int price) {
		super();
		ID = iD;
		Name = name;
		Description = description;
		Orderby = orderby;
		Price = price;
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
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getOrderby() {
		return Orderby;
	}
	public void setOrderby(String orderby) {
		Orderby = orderby;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Order [ID=" + ID + ", Name=" + Name + ", Description=" + Description + ", Orderby=" + Orderby
				+ ", Price=" + Price + "]";
	}

}
