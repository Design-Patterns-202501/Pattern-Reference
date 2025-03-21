package com.patrones.entities;

public class Address {
    private String address;
    private String city;
    private String country;
    private String zone;

    public Address() {}
    public Address(String address, String city, String country, String zone) {
    this.address = address;
    this.city = city;
    this.country = country;
    this.zone = zone;
    }

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}


};
