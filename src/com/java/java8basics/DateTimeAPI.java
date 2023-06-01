package com.java.java8basics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateTimeAPI {													//Immutable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<LocalDate> list = new ArrayList<LocalDate>();
		
				list.add(LocalDate.of(1990, Month.MAY, 1));
				list.add(LocalDate.of(1990, Month.MAY, 20));
				list.add(LocalDate.of(1990, Month.MAY, 5));
				list.add(LocalDate.of(1990, Month.MAY, 2));
				list.add(LocalDate.of(1990, Month.MAY, 24));
		
		
		//List<LocalDate> sorted = list.stream().sorted().collect(Collectors.toList());
		//sorted.forEach(action -> System.out.println(action));
		
		System.out.println("------------");
		
		//list.stream().sorted((o1,o2) -> o2.getYear()-o1.getYear());
		Collections.sort(list);
		System.out.println(list);
		
		//System.exit(0);

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate ldo = LocalDate.of(1990, Month.MAY, 24);					// to specify date 
		System.out.println(ldo);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		LocalTime lto = LocalTime.of(8, 18, 46);
		System.out.println(lto);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(ldo.format(dtf));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		Instant i = Instant.now();
		System.out.println(i);
		
		Calendar cl = Calendar.getInstance();
		System.out.println(cl);

	}
}
