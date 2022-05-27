package com.sensei.person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {

	
	
	 public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<>();
			
			list.add(new Person ("Sandeep",LocalDate.of(1997,3,5),LocalDate.of(1999,5,6)));
			list.add(new Person ("Sanjay",LocalDate.of(1932,6,5),LocalDate.of(1998,5,6)));
			list.add(new Person ("Manish",LocalDate.of(1996,9,4),LocalDate.of(2000,5,6)));
			
			Collections.sort(list, new Comparator<Person>() {

				@Override
				public int compare(Person o1, Person o2) {
					// TODO Auto-generated method stub
					return o1.DoD.compareTo(o1.DoB);
				}
				
			});
			
			System.out.println(list);
					
		}
	}

