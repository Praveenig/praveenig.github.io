package TASK;

import java.util.Date;

public class Person {
	String name;
	long dob;
	long dod;
	public Person(String name, long dob, long dod) {
		super();
		this.name = name;
		this.dob = dob;
		this.dod = dod;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDob() {
		return dob;
	}
	public void setDob(long dob) {
		this.dob = dob;
	}
	public long getDod() {
		return dod;
	}
	public void setDod(long dod) {
		this.dod = dod;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", dod=" + dod + "]";
	}
	

}
