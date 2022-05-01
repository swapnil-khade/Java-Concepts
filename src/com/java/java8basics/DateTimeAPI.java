package com.java.java8basics;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		LocalDate ldo = LocalDate.of(2022, Month.MAY, 01);
		System.out.println(ldo);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		LocalTime lto = LocalTime.of(8, 18, 46);
		System.out.println(lto);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(ldo.format(dtf));

	}

}
