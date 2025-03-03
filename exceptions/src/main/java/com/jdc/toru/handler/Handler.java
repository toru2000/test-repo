package com.jdc.toru.handler;

public class Handler {
	private Person person;
	
	public Handler() {
		super();
		person = new Person();
	}
	
	public void useName() {
		try	{
			person.setName("Aye Aye");
			System.out.println(person.getName());
			
		}catch(NullPointerException e) {
			System.out.println("This is NullPointerException because there is no person object");
		}
		
	}
	
	public void useAge() {
		person.setAge(20);
		int age = dividedByZero(person.getAge());
		System.out.println(person.getAge());
	}
	public void recursive() {
		if(person.getAge() > 0) {
			recursive();
		}
	}
	private int dividedByZero(int age) {
		return age/0;
	}
	
}
