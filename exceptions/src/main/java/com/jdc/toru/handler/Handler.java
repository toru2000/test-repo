package com.jdc.toru.handler;

public class Handler {
	private Person person;
	private int count=1;
	
	public Handler() {
		super();
		person = new Person();
	}
	
	//NUllPointerException when person object is not create yet
	public void useName() {
		try	{
			person.setName("Aye Aye");
			System.out.println(person.getName());
			
		}catch(NullPointerException e) {
			System.out.println("This is NullPointerException because there is no person object");
		}
		
	}
	
	//ArithmethicExcreption
	public void useAge() {
		try {
			person.setAge(20);
			int age = dividedByZero(person.getAge());
			System.out.println(person.getAge());
		} 
		catch(ArithmeticException e) {
			System.out.println("This is ArithmethicException because any number can't divided by zero!");
		}
		
	}
	
	//StackOverFlowError
	public void recursive() {
		try {
			if(count > 0) {
				System.out.println("recursive :"+count);
				count++;
				recursive();
			} 
		}
		catch (StackOverflowError e) {}
	}	
	private int dividedByZero(int age) {
		return age/0;
	}
	
}
