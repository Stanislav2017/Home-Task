package com.mykheikin.ParserJavaJSONJava;

import java.util.List;

public class Staff {

	private String name;
	private String surname;
	private List<String> phones;
	private List<String> sites;
	private Address addr;

	public Staff() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public List<String> getSites() {
		return sites;
	}

	public void setSites(List<String> sites) {
		this.sites = sites;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ",\nsurname=" + surname + ",\nphones=" + phones + ",\nsites=" + sites
				+ ",\naddr=" + addr + "]";
	}
}
