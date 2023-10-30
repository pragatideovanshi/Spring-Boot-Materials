package com.HibernateSQLSERVER.ProjectSQLSERRVER;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "StudentAddress")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Address_ID")
	private int AddressId;
	
	@Column(length = 50,name="STREET")
	private String Street;
	
	private String City;
	
	private boolean isOpen;
	
	@Transient
	private  double x;
	
	@Column(name="Added_Date")
	@Temporal(TemporalType.DATE)
	private Date adddate;
	
	@Lob
	private byte[] image;
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAdddate() {
		return adddate;
	}
	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Address(int addressId, String street, String city, boolean isOpen, double x, Date adddate, byte[] image) {
		super();
		AddressId = addressId;
		Street = street;
		City = city;
		this.isOpen = isOpen;
		this.x = x;
		this.adddate = adddate;
		this.image = image;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [AddressId=" + AddressId + ", Street=" + Street + ", City=" + City + ", isOpen=" + isOpen
				+ ", x=" + x + ", adddate=" + adddate + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	

}
