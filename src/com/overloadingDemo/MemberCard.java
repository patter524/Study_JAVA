package com.overloadingDemo;

public class MemberCard {
	private String firstName, lastName;

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("firstName = %s,lastName = %s",firstName,lastName);
//		return super.toString();
	}

	public MemberCard(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public MemberCard() {
		// TODO Auto-generated constructor stub
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String[] args) {

	}

}
