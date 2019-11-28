package com.alpersayin.jsondemo;

public class ContactAddress {
	
	private String street;
	private String city;
	private String zip;
	private String country;
	
	public ContactAddress() {
		super();
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "ContactAddress [street=" + street + ", city=" + city + ", zip=" + zip + ", country=" + country + "]";
	}
	
	
//	
}
