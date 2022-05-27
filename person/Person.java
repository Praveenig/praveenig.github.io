package com.sensei.person;

import java.time.LocalDate;

public class Person {
 
	String name;
 LocalDate DoD;
 LocalDate DoB;
public Person(String name, LocalDate doD, LocalDate doB) {
	super();
	this.name = name;
	DoD = doD;
	DoB = doB;
}
@Override
public String toString() {
	return "Person [name=" + name + ", DoD=" + DoD + ", DoB=" + DoB + "]";
}

 
 
 
}
