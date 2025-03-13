package com.jdc.toru.test;

import java.util.Scanner;

public class Test {
	static Scanner sc =new Scanner(System.in);
	static int a,b,result;
	
	public static void main(String[] args) {
		try {
			System.out.println("Enter a first number!!!");
			 a = sc.nextInt();
			
			System.out.println("Enter a first number!!!");
			b = sc.nextInt();
			
			result =  a / b;
			System.out.println("Result : "+ result);
			
		} catch (ArithmeticException e) {
			System.out.println("zero cannot divided to other number");
		}
		catch(Exception e) {
			System.out.println("Invid number!please type number only");
		}
		finally {
			System.out.println("System is complete!!");
			sc.close();
		}
		
	}
		
}
