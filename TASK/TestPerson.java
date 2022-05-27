package TASK;

import java.util.ArrayList;
import java.util.Collections;

import ComparatorExample.Item;

public class TestPerson {
	public static void main(String[] args) {
		
		Person p1=new Person("abc",1960-01-01,1990-12-12);
		Person p2=new Person("xyz",1920-01-01,1970-12-12);
		Person p3=new Person("efg",1900-01-01,1940-12-12);
		
		ArrayList<Person> justPerson = new ArrayList();
		justPerson.add(p1);
		justPerson.add(p2);
		justPerson.add(p3);
		
		System.out.println(justPerson);		
		
		DoDComparator objDoD = new DoDComparator();
		Collections.sort(justPerson,objDoD);
		System.out.println("Sorting by Date of Death:");
		for(Person p:justPerson) {
			System.out.println(p);
		}
	}

}
