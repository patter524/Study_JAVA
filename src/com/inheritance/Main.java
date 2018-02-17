package com.inheritance;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("Peter");
		student.setLastName("Parker");
		student.setGender("M");
		student.setFaculty("Computer Science");
		student.setDob(LocalDate.of(1995, Month.APRIL, 13));

		System.out.println(student.ageYears());
		
		ExchangeStudent exchangeStudent = new ExchangeStudent();
		
		exchangeStudent.setFirstName("Ann");
		exchangeStudent.setPartnerUniversity("ABC univesity");
		exchangeStudent.setDob(LocalDate.of(1998, Month.AUGUST, 15));
		System.out.println(exchangeStudent.ageYears());
	}

}
