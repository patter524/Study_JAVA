package com.inheritance;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String firstName,lastName;
	private String gender;
	private LocalDate dob;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
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
	
	public int ageYears() {
		Period period = Period.between(dob, LocalDate.now());
		return period.getYears();
	}
}
