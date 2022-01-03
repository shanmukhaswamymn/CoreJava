package com.xworkz.gunTask.dto;

public class CompanyDTO {
	private String name;
	private String location;
	private long contact;
	private String founder;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	
	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", location=" + location + ", contact=" + contact + ", founder=" + founder
				+ "]";
	}
	
	

}
