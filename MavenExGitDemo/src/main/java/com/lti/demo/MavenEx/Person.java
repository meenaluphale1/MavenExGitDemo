package com.lti.demo.MavenEx;

public class Person {
	
	private int personId;
	private String personName;
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
	

}
